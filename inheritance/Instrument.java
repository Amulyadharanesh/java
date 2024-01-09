public class Instrument {
    String type;
    String material;
    boolean requiresElectricity;


    void play() {
        System.out.println("Playing the instrument");
    }

    void tune() {
        System.out.println("Tuning the instrument for optimal sound");
    }
}