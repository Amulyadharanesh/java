public class TelePhone{
	TelePhone(){
	System.out.println("Constructor");	
	}
	
	TelePhone(float value){
	System.out.println("type of params");
	}
	
	TelePhone(char num,long number){
	System.out.println("types of params");
	}
	
	TelePhone(long number,char num){
	System.out.println("order of params");
    }

public static void main(String[]args){
    new TelePhone();
	new TelePhone(56.78f);
	new TelePhone('A',957468257L);
	new TelePhone(957468257L,'A');
}
}
	
	
	