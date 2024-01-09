public class WashingMachine extends Appliance {
    String loadType;
    int maxLoadCapacityInKg;

    
    void washClothes() {
        System.out.println("Washing clothes using the washing machine");
    }

    void setTimer() {
        System.out.println("Setting a timer for the washing");
    }
}