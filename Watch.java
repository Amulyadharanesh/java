public class Watch{
	public static void main(String[] args){
	short value=33;
	add(34565563L,4.35f,value);
	add(value,4.35f,34565563L);
	add(4.35f,value,34565563L);
	min( 24563, 546537);
	min(24563, 546537,657647);
	min(24563, 546537,657647,874563);
	short num=300;
	max(num);
	byte number=121;
	max(number);
	max(45.76f);
		
	 }
		static void add(double num1,float num2,short value)
	 {
	System.out.println("1st method");
     }

     static void add(short value,float num2,double num1)
	 {
	 System.out.println("2nd method");
	 }
	  
	 static void add(float num2,short value,double num1)
	 {
	System.out.println("3rd method");
	  }
	  
    static void min(int a ,int b)
	{
	int c=a+b;
	System.out.println("4th method");
	System.out.println("number" + c);
	}
	
	static void min(int a,int b,int c)
    {
	int d=c-a;
	System.out.println("5th method");
	System.out.println("number" + d);
	}
	
	static void min(int a,int b,int c,int d)
	{
	int e=b*a;
	System.out.println("6th method");
	System.out.println("number" + e);
	}

    static void max(byte value)
	{
		System.out.println("7th method");
		
	}
	
	static void max(short value)
	{
		System.out.println("8th method");
	}

	static void max(float value)
	{
		System.out.println("9th method");
	}
}
	
	
	

	




	  
	  
	  
