public class Smartphone {
    boolean isOn;
    String brand;
    int model;
    int batteryLevel;
    boolean isWifiEnabled;
    boolean isGPSActive;
	
	public Smartphone(boolean isOn, String brand,int model,int batteryLevel, boolean isWifiEnabled, boolean isGPSActive) {
        this.isOn=isOn;
        this.model=model;
        this. batteryLevel=batteryLevel;
        this.isWifiEnabled=isWifiEnabled;
		this.isGPSActive=isGPSActive;
    }


    public void powerOn() {
        
        System.out.println("Smartphone is powered on.");
    }

    public void powerOff() {
       
        System.out.println("Smartphone is powered off.");
    }

    public void chargeBattery() {
        
        System.out.println("Battery charged");
		}

    public void displayDetails() {
        System.out.println("Smartphone Details:");
        System.out.println("Power: " + isOn );
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel );
        System.out.println("Wi-Fi: " + isWifiEnabled );
        System.out.println("GPS: " + isGPSActive );
        
    }

   public static void main(String[] args) {
       Smartphone phn = new Smartphone(true,"NOKIA",2005,80,true,false);
        phn.powerOn();
		phn.powerOff();
        phn.chargeBattery();
        
       
}
}
