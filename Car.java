public class Car{
	String brandName;
	String colour;
	long price;
	float mileage;
	int engineCapacity;
	byte noOfAirBags;
	short topSpeed;
	boolean havingAc;
	
	Car(String brandName,String colour,long price,float mileage,int engineCapacity,byte noOfAirBags,short topSpeed,boolean havingAc){
		this.brandName=brandName;
		this.colour=colour;
		this.price=price;
		this.mileage=mileage;
		this.engineCapacity=engineCapacity;
		this.noOfAirBags=noOfAirBags;
		this.topSpeed=topSpeed;
		this.havingAc=havingAc;
	}
	
	public static void main(String[]args){
	byte value=6;
	short num=250;
	byte value1=7;
	short num1=196;
	short num2=170;
	byte value2=4;
	short num3=185;
	short num4=191;
	short num5=155;
		
	Car obj	=new Car("LandRoverDefender","Black",35200000L,13.16f,90,value,num,true);
	System.out.println(obj.brandName);
	System.out.println(obj.colour);
	System.out.println(obj.price);
	System.out.println(obj.mileage);
	System.out.println(obj.engineCapacity);
	System.out.println(obj.noOfAirBags);
	System.out.println(obj.topSpeed);
	System.out.println(obj.havingAc);
	
	System.out.println("_____________________");
	

	Car obj1=new Car("MercedesBenz","White",5270000L,16.9f,1993,value1,num1,true);
	System.out.println(obj1.brandName);
	System.out.println(obj1.colour);
	System.out.println(obj1.price);
	System.out.println(obj1.mileage);
	System.out.println(obj1.engineCapacity);
	System.out.println(obj1.noOfAirBags);
	System.out.println(obj1.topSpeed);
	System.out.println(obj1.havingAc);
	
	System.out.println("____________________");
	
	Car obj2=new Car("InovaCrysta","Grey",200000L,12.0f,2393,value1,num2,true);
	System.out.println(obj2.brandName);
	System.out.println(obj2.colour);
	System.out.println(obj2.price);
	System.out.println(obj2.mileage);
	System.out.println(obj2.engineCapacity);
	System.out.println(obj2.noOfAirBags);
	System.out.println(obj2.topSpeed);
	System.out.println(obj2.havingAc);
	
	System.out.println("___________________");
	
	Car obj3=new Car("SkodaRapid","Blue",6990000L,21.72f,1498,value2,num3,true);
	System.out.println(obj3.brandName);
	System.out.println(obj3.colour);
	System.out.println(obj3.price);
	System.out.println(obj3.mileage);
	System.out.println(obj3.engineCapacity);
	System.out.println(obj3.noOfAirBags);
	System.out.println(obj3.topSpeed);
	System.out.println(obj3.havingAc);
	
	System.out.println("______________");
	
	Car obj4=new Car("AlfaRomeo","Red",479100000L,24.0f,1962,value,num4,true);
	System.out.println(obj4.brandName);
	System.out.println(obj4.colour);
	System.out.println(obj4.price);
	System.out.println(obj4.mileage);
	System.out.println(obj4.engineCapacity);
	System.out.println(obj4.noOfAirBags);
	System.out.println(obj4.topSpeed);
	System.out.println(obj4.havingAc);
	
	System.out.println("_____________");
	
	Car obj5=new Car("Supra","Green",85000000L,13.2f,1998,value,num5,true);
	System.out.println(obj5.brandName);
	System.out.println(obj5.colour);
	System.out.println(obj5.price);
	System.out.println(obj5.mileage);
	System.out.println(obj5.engineCapacity);
	System.out.println(obj5.noOfAirBags);
	System.out.println(obj5.topSpeed);
	System.out.println(obj5.havingAc);
	
	System.out.println("___________");
}
}
	
	
	
	
	
	

	

	
	