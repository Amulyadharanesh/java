public class Latte extends Coffee {
    int milkRatio;
    boolean hasFoam;

    
    void steamMilk() {
        System.out.println("Steaming milk to the desired temperature");
    }

    void pourOverEspresso() {
        System.out.println("Pouring steamed milk over a one shot of espresso");
    }
}