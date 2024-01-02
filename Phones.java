public static Phone{
	static String brandName;
    int price;
    static String SamsungPhoneMadeIn;
    static String PhoneFeature;
    String operatingSystem;
    int batteryBackUp;
	
	Phone(String operatingSystem,int price,int batteryBackUp)//non-static init with constr
	{
		this.operatingSystem=operatingSystem;
		this.price=price;
		this.batteryBackUp=batteryBackUp;
	}

	 static
	 {
	 brandName="Samsung";
	 SamsungPhoneMadeIn="Korea";
	 PhoneFeature="Block Unwanted Calls";
	 }
	 
}
	 
 