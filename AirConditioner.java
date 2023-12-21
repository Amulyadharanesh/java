public class AirConditioner {
    String brandName;
    int powerConsumption;
    String colour;
    int price;
    boolean isItDualClimatic;
    int warranty;

    AirConditioner(String brandName, int powerConsumption, String colour, int price, boolean isItDualClimatic, int warranty) {
        this(brandName, powerConsumption, colour, price, isItDualClimatic);
        this.warranty = warranty;
        System.out.println("6 constructor param");
    }

    AirConditioner(String brandName, int powerConsumption, String colour, int price, boolean isItDualClimatic) {
        this(brandName, powerConsumption, colour, price);
        this.isItDualClimatic = isItDualClimatic;
        System.out.println("5 constructor param");
    }

    AirConditioner(String brandName, int powerConsumption, String colour, int price) {
        this(brandName, powerConsumption, colour);
        this.price = price;
        System.out.println("4 constructor param");
    }

    AirConditioner(String brandName, int powerConsumption, String colour) {
        this(brandName, powerConsumption);
        this.colour = colour;
        System.out.println("3 constructor param");
    }

    AirConditioner(String brandName, int powerConsumption) {
        this(brandName);
        this.powerConsumption = powerConsumption;
        System.out.println("2 constructor param");
    }

    AirConditioner(String brandName) {
        this();
        this.brandName = brandName;
        System.out.println("1 constructor param");
    }

    AirConditioner() {
        System.out.println("NO CONSTRUCTOR PARAM");
    }

    public void display() {
        System.out.println("AC brandName: " + brandName);
        System.out.println("powerConsumption: " + powerConsumption);
        System.out.println("colour: " + colour);
        System.out.println("price: " + price);
        System.out.println("AC is Dual Climatic: " + isItDualClimatic);
        System.out.println("AC warranty: " + warranty);
    }
}

	
	
	
	

	
	
	


	