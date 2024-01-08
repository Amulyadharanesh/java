public class IceCream {
     String flavor;
     boolean isScooped;
     boolean hasToppings;
	 boolean isMelted;
     boolean isDecorated;
     boolean isFrozen;
    
	 static void scoop() {
        
       System.out.println("Ice cream is already scooped.");
       
    }

    static void addToppings() {
    
      System.out.println("Ice cream already has toppings.");
        
    }

    static void enjoy() {
        
       System.out.println("Add toppings before enjoying.");
       
    }
	
	public IceCream(String flavor,boolean isScooped,boolean hasToppings,boolean isMelted,boolean isDecorated,boolean isFrozen) {
        this.flavor = flavor;
        this.isScooped = isScooped;
        this.hasToppings = hasToppings;
		this.isMelted = isMelted;
        this.isDecorated = isDecorated;
        this.isFrozen = isFrozen;
    }
	
	public void displayDetails()
	{
	
	System.out.println("Ice cream flavor:" +flavor);
	System.out.println("Ice cream is Scooped :" +isScooped);
	System.out.println("Ice cream has Toppings:" +hasToppings);
	System.out.println("Ice cream is Melted:" +isMelted);
	System.out.println("Ice cream is Decorated:" +isDecorated);
	System.out.println("Ice cream is Frozen:" +isFrozen);
	
	}
	
    public static void main(String[] args) {
     IceCream cream=new IceCream("Vanilla",true,true,false,false,true);
	 cream.scoop();
	 cream.addToppings();
	 cream.enjoy();
	
	 
	 cream.displayDetails();
	}    
}

	