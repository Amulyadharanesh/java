public class Jupiter{
	Jupiter(){
	System.out.println("Constructor");	
	}
	
	Jupiter(float value){
	System.out.println("type of params");
	}
	
	Jupiter(short num,byte number){
	System.out.println("types of params");
	}
	
	Jupiter(byte number,short num){
	System.out.println("order of params");
    }

public static void main(String[]args){
	short num=189;
	byte number=109;
    new Jupiter();
	new Jupiter(56.78f);
	new Jupiter(num,number);
	new Jupiter(number,num);
}
}