public class Time{
	Time(){
	System.out.println("Constructor");	
	}
	
	Time(char value){
	System.out.println("type of params");
	}
	
	Time(float num,long number){
	System.out.println("types of params");
	}
	
	Time(long number,float num){
	System.out.println("order of params");
    }

public static void main(String[]args){
    new Time();
	new Time('D');
	new Time(45.78f,636468257L);
	new Time(636468257L,45.78f);
}
}