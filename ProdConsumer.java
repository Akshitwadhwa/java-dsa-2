import java.util.Scanner;
public class ProdConsumer {
     int arr[];
    static int top=-1;
    ProdConsumer()
    {
        arr=new int[5];
    }
    public  void produce(int n)
    {
        top+=1;
        if(top<5)
        {
            arr[top]=n;
        System.out.print("Entity Produced, current array:");
        for(int i=0;i<5;++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
        else{
            System.out.println("Buffer already full, Production not done.");
            top-=1;}
    }
    public  void consume()
    {
        if(top>=0){
            arr[top]=0;
            top-=1;
        System.out.println("Last Entity consumed,current array:");
            for(int i=0;i<5;++i)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else System.out.println("Buffer already empty, no operation done.");
    }
    public static void main(String args[]) {
        ProdConsumer obj=new ProdConsumer();
        Scanner sc = new Scanner(System.in);
        int decide = 0;
        int choice=0;
        int n=0;
        while (decide != 10) {
            System.out.println("Enter 10 if you want to end the process,else enter 0");
            decide=sc.nextInt();
            System.out.println("Enter 1 if you want to produce,press 2 if you want to consume:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:{
                             System.out.println("Enter the number to produce");
                             n=sc.nextInt();
                             obj.produce(n);
                             break;}
                case 2:{        obj.consume();
                                break;}
                default:System.out.println("Invalid input");
            }
        }
    }
}