public class Number{
	Number(){
	System.out.println("no params");	
	}
	
	Number(int value){
	System.out.println("type params");
	}
	
	Number(int value,float num){
	System.out.println("types of params");
	}
	
	Number(float num,int value){
	System.out.println("order of params");
	}


    public static void main(String[]args){
	new Number();
    new Number(345);
	new Number(675,34.673f);
	new Number(34.673f,675);
	}
	
		
}

		
	