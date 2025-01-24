#include <iostream>
#include <queue>
using namespace std;

struct Process {
    int id, arrivalTime, burstTime, remainingTime, waitingTime, turnAroundTime, finishTime;
};

void findWaitingTime(Process proc[], int n, int quantum) {
    queue<int> q;
    int currentTime = 0;
    int completed = 0; 
    bool visited[n] = {false};

    
    for (int i = 0; i < n; i++) {
        proc[i].remainingTime = proc[i].burstTime;
    }

    // Start with processes that have arrived
    q.push(0);
    visited[0] = true;

    while (completed < n) {
        int i = q.front();
        q.pop();

        if (proc[i].remainingTime > quantum) {
            currentTime += quantum;
            proc[i].remainingTime -= quantum;
        } else {
            currentTime += proc[i].remainingTime;
            proc[i].remainingTime = 0;
            completed++;
            proc[i].finishTime = currentTime;
            proc[i].turnAroundTime = proc[i].finishTime - proc[i].arrivalTime;
            proc[i].waitingTime = proc[i].turnAroundTime - proc[i].burstTime;
        }

        // Check if new processes have arrived
        for (int j = 0; j < n; j++) {
            if (proc[j].arrivalTime <= currentTime && proc[j].remainingTime > 0 && !visited[j]) {
                q.push(j);
                visited[j] = true;
            }
        }

        if (proc[i].remainingTime > 0) {
            q.push(i); // Push current process back if not finished
        }
    }
}

// Function to calculate average waiting and turnaround times
void calculateAverageTimes(Process proc[], int n, int quantum) {
    int totalWaitingTime = 0, totalTurnAroundTime = 0;

    findWaitingTime(proc, n, quantum);

    cout << "\nProcess\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; i++) {
        totalWaitingTime += proc[i].waitingTime;
        totalTurnAroundTime += proc[i].turnAroundTime;
        cout << proc[i].id << "\t" << proc[i].arrivalTime << "\t\t"
             << proc[i].burstTime << "\t\t" << proc[i].waitingTime << "\t\t"
             << proc[i].turnAroundTime << "\n";
    }

    cout << "\nAverage waiting time: " << (float) totalWaitingTime / n;
    cout << "\nAverage turnaround time: " << (float) totalTurnAroundTime / n;
}

int main() {
    int n = 5, quantum = 3;

    Process proc[] = {
        {1, 5, 6, 0, 0, 0, 0},
        {2, 3, 8, 0, 0, 0, 0},
        {3, 2, 9, 0, 0, 0, 0},
        {4, 4, 4, 0, 0, 0, 0},
        {5, 3, 7, 0, 0, 0, 0}
    };

    calculateAverageTimes(proc, n, quantum);

    return 0;
}