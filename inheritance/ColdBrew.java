public class ColdBrew extends Coffee {
    int brewTimeInHours;
    boolean servedOverIce;

   
    void steepInColdWater() {
        System.out.println("Steeping coffee grounds in cold water for an extended period");
    }

    void pourOverIce() {
        System.out.println("Pouring cold brew coffee over a glass filled with ice");
    }
}