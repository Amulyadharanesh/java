public class TV{
    boolean isOn;
    String type;
    int volume;
    int channel;
    boolean isMuted;
    boolean isRemoteAvailable;

    

    static void powerOn() {
        System.out.println("TV powered on.");
    }

    static void powerOff() {
        
        System.out.println("TV powered off.");
    }

    static void changeChannel() {
        
            System.out.println("Turn on the TV before changing the channel.");
        }
		
		public TV(boolean isOn,String type,int volume,int channel,boolean isMuted,boolean isRemoteAvailable) {
        this.isOn = isOn;
        this.type = type;
        this.volume = volume;
        this.channel =channel;
        this.isMuted = isMuted;
        this.isRemoteAvailable = isRemoteAvailable;
    }
	
	public void displayDetails()
	{
	
	System.out.println("Tv is on :" +isOn);
	System.out.println("Tv type :" +type);
	System.out.println("Tv has volume:" +volume);
	System.out.println("Tv can change the channel:" +channel);
	System.out.println("tv can be muted:" +isMuted);
	System.out.println("TV HAS REMOTE:" +isRemoteAvailable);
	
	}
    
	public static void main(String[] args) {
	TV tv=new TV(true,"OLED",50,45,false,true);
	
     tv.powerOn();
     tv.powerOff();
     tv.changeChannel();
	 
	 tv.displayDetails();
	}
	}
