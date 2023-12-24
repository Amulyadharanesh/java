public class CameraRunner {
    String brandName;
    int price;
    long resolution;
    CamerType type1;
    BatteryType type2;
    ChargingType type3;
    DisplayType type4;
    int modelYear;
    String[] features;

    CameraRunner() {
        System.out.println("no param");
    }

    CameraRunner(String brandName, int price, long resolution, CamerType type1, BatteryType type2,
            ChargingType type3, DisplayType type4, int modelYear, String[] features)
	{
        this.brandName = brandName;
        this.price = price;
        this.resolution = resolution;
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.type4 = type4;
        this.modelYear = modelYear;
        this.features = features;
    }

    public void displayCameraDetails() {
        System.out.println("Camera Brand Name: " + brandName);
        System.out.println("Camera price: " + price);
        System.out.println("Camera resolution: " + resolution);
        System.out.println("Camera type: " + type1);
        System.out.println("Camera batteryType: " + type2);
        System.out.println("Camera chargingType: " + type3);
        System.out.println("Camera displayType: " + type4);
        System.out.println("Camera model year: " + modelYear);
        System.out.println("Camera Features:");
    for (String feature : features) {
        System.out.println("----- " + feature);
    }
	}

    public static void main(String[] args) {
        String[] features = { "Resolution", "GPS","Wi-Fi","fourKVideo","TouchScreen"};

        CameraRunner camera = new CameraRunner("Sony", 45000, 2567L, CamerType.COMPACTDIGITAL,
                BatteryType.LITHIUMBATTERIES, ChargingType.TYPEA, DisplayType.LCD, 2021, features);

        camera.displayCameraDetails();
		System.out.println("/////////////////////////////////"); 

        switch (camera.type1) {
            case COMPACTDIGITAL:
                System.out.println("Camera type is COMPACTDIGITAL");
                break;
            case DIGITALSLRCAMERA:
                System.out.println("Camera type is DIGITALSLRCAMERA");
                break;
            case MIRROLESSCAMERA:
                System.out.println("Camera type is MIRROLESSCAMERA");
                break;
			case ALLROUNDERCAMERA:
			    System.out.println("Camera type is ALLROUNDERCAMERA "); 
				break;
			case FILMCAMERA:
			    System.out.println("Camera type is FILMCAMERA"); 
				break;
			case ACTIONCAMERA:
			    System.out.println("Camera type is ACTIONCAMERA"); 
				break;	
        }
		CameraRunner camera1 = new CameraRunner("Nikon",55000, 3067L, CamerType.COMPACTDIGITAL,
                BatteryType.LITHIUMBATTERIES, ChargingType.TYPEC, DisplayType.LCD, 2022, features);
		camera1.displayCameraDetails();	
		System.out.println("/////////////////////////////////"); 
		
		CameraRunner camera2 = new CameraRunner("Canon",60000, 4000L, CamerType.COMPACTDIGITAL,
                BatteryType.ALKALINEBATTERIES, ChargingType.TYPEE, DisplayType.OLED, 2023, features);
		camera2.displayCameraDetails();	
		System.out.println("/////////////////////////////////"); 
		
		CameraRunner camera3 = new CameraRunner("Panasonic",42000, 1000L, CamerType.COMPACTDIGITAL,
                BatteryType.ALKALINEBATTERIES, ChargingType.TYPEF, DisplayType.AMOLED, 2022, features);
		camera3.displayCameraDetails();	
		System.out.println("/////////////////////////////////"); 
		
		CameraRunner camera4 = new CameraRunner("Samsung",62000, 5000L, CamerType.COMPACTDIGITAL,
                BatteryType.ALKALINEBATTERIES, ChargingType.TYPEF, DisplayType.AMOLED, 2018, features);
		camera4.displayCameraDetails();	
		System.out.println("/////////////////////////////////"); 
		
		CameraRunner camera5 = new CameraRunner("Leica",42000, 1000L, CamerType.COMPACTDIGITAL,
                BatteryType.NICDBATTREIES, ChargingType.TYPED, DisplayType.AMOLED, 2021, features);
		camera5.displayCameraDetails();	
		 
		
    }
}

		
	
	
		
		
		