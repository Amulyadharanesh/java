public class LinkedIn{
	LinkedIn(){
	System.out.println("Constructor");	
	}
	
	LinkedIn(float value){
	System.out.println("type of params");
	}
	
	LinkedIn(short num,byte number){
	System.out.println("types of params");
	}
	
	LinkedIn(byte number,short num){
	System.out.println("order of params");
    }

public static void main(String[]args){
	short num=200;
	byte number=114;
    new LinkedIn();
	new LinkedIn(56.78f);
	new LinkedIn(num,number);
	new LinkedIn(number,num);
}
}