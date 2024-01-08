public class Fan {
    boolean isOn;
    int speedLevel;
    boolean isOscillating;
    boolean hasRemoteControl;
    String color;
    boolean isTimerSet;
	
	public Fan(boolean isOn,int speedLevel,boolean isOscillating, String color) {
        this.isOn= isOn;
        this.speedLevel=speedLevel;
        this.isOscillating=isOscillating;
        this.color=color;
    }


    public void turnOn() {
        System.out.println("Fan is turned on.");
    }

    public void turnOff() {
        
        System.out.println("Fan is turned off.");
    }

    public void increaseSpeed() {
        
        System.out.println("Speed increased to level ");
    }

    public void displayDetails() {
        System.out.println("Fan Details:");
        System.out.println("Power: " +isOn );
        System.out.println("Speed: " + speedLevel);
        System.out.println("Oscillating: " +isOscillating);
        System.out.println("Remote Control: " +hasRemoteControl );
        System.out.println("Color: " + color);
        System.out.println("Timer Set: " +isTimerSet );
        
    }
	
	public static void main(String[] args) {
        Fan fan = new Fan(true,4,true,"black");

        fan.turnOn();
        fan.turnOff();
        fan.increaseSpeed();

        fan.displayDetails();
    }
}


    

