public class Cars {
    String brand;
    String model;
    int year;
    boolean isEngineOn;
    int speed;

    public Cars(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isEngineOn = isEngineOn;
        this.speed = speed;
    }

    public void startEngine() {
        
        System.out.println("Engine started");
    }

    public void stopEngine() {
        
        System.out.println("Engine stopped.");
    }

    public void accelerate() {
        
            System.out.println("Start the engine before accelerating.");
        
    }

    public void brake() {
        
            System.out.println("Start the engine applying brakes.");
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine is on: " +isEngineOn);
        System.out.println("Speed of car: " +speed);

    }

    public static void main(String[] args) {
        Cars myCar = new Cars("Toyota", "Crysta",2023);

        myCar.startEngine();
		myCar.stopEngine();
        myCar.accelerate();
        myCar.brake();

        myCar.displayDetails();
    }
}
