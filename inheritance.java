class Device {
    String modelName;
    double cost;


        public static void main(String[] args) {
            latop laptop = new latop("mac", 400, 32);
            laptop.displayDetails();
        }

    Device(String modelName, double cost) {
        this.modelName = modelName;
        this.cost = cost;
    }

    void displayDetails() {
        System.out.println("Device model: " + modelName + ", Cost: $" + cost);
    }
}

class latop extends Device {
    int ramsize;

    latop(String modelName, double cost, int ramsize) {
        super(modelName, cost);
        this.ramsize = ramsize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("RAM: " + ramsize + "GB");
    }
}

