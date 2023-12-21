public class AirConditionerFeature {
    public static void main(String[] args) {

        AirConditioner Ac = new AirConditioner("LG", 835, "White", 45000, true, 1);
        Ac.display();

        System.out.println("////////////////////////////////");

        AirConditioner Ac1 = new AirConditioner("Samsung", 2000, "Black", 50000, true);
        Ac1.display();

        System.out.println("////////////////////////////////");

        AirConditioner Ac2 = new AirConditioner("Sony", 1500, "Blue", 60000);
        Ac2.display();

        System.out.println("////////////////////////////////");

        AirConditioner Ac3 = new AirConditioner("Voltas", 1800, "MattBlack");
        Ac3.display();

        System.out.println("////////////////////////////////");

        AirConditioner Ac4 = new AirConditioner("BlueStar", 20500);
        Ac4.display();

        System.out.println("////////////////////////////////");

        AirConditioner Ac5 = new AirConditioner("Onida");
        Ac5.display();
    }
}

	
	