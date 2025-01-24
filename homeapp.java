class homeapp {
    String brand;
    int powerrating;
    public static void main(String[] args){
    airconditioner airconditioner = new airconditioner("LG", 30, 16.0);
    airconditioner.displayDetails();
    }
// defining the constructor
    homeapp(String brand, int powerrating) {
        this.brand = brand;
        this.powerrating = powerrating;
    }

    void displayDetails() { 
        System.out.println("Brand: " + brand + ", Power Rating: " + powerrating);
    }
}

class airconditioner extends homeapp {
    double currenttemp;

    airconditioner(String brand, int powerrating, double currenttemp) {
        super(brand, powerrating);
        this.currenttemp = currenttemp;
    }

    @Override
        super.displayDetails();
        System.out.println("Current Temperature: " + currenttemp);
    }



 
    
        