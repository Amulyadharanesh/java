public class Guitar extends Instrument {
    int numberOfStrings;
    boolean hasPickup;

   
    void strum() {
        System.out.println("Strumming the guitar strings");
    }

    void useAmplifier() {
        
            System.out.println("Using an amplifier for electric guitar sound");
        }
    }