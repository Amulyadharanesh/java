public class Plant {
    String plantName;
    int height;
	float phValue;
    

    
    Plant(String plantName,int height,float phValue) {
        this.plantName = plantName;
        this.height = height;
		this.phValue = phValue;
        
        
        		
    }

    
    Plant() {
        this("Jasmine");
        System.out.println("no param constructor");
    }

    
    Plant(String plantName) {
        this(8);
        System.out.println("param");
    }

    
    Plant(int height){
       this(3.5f);
        System.out.println("param1");
    }
    Plant(float phValue){
		System.out.println("param2");
    }
		
    public static void main(String[] args) {
        Plant obj = new Plant();
    }
}

	
		
	
	