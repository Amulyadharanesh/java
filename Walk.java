public class Walk{
	public static void main(String[] args){
		// Up casting
	byte value= 45;
	short number= value;
	System.out.println(value);	
	
	short value1=784;
	int number1=value1;
	System.out.println(value1);
	
    int value2=1456767312;
	long number2=value2;
	System.out.println(value2);
	
	float value3=34.78f;
	double number3=value3;
	System.out.println(value3);
	
	char value4='A';
	int number4=value4;
	System.out.println(value4);
	
	int value5=234153;
	char number5=(char)value5;
	System.out.println(value5);
	
	//Down casting
	long val=9538287479L;
	int num=(int)val;
	System.out.println(num);
	
	int val1=23464563;
	short num1=(short)val1;
	System.out.println(num1);
	
	short val2=345;
	byte num2=(byte)val2;
	System.out.println(num2);
	
	double val3=32.526561d;
	float num3=(float)val3;
	System.out.println(num3);
	
	int val4=1235325;
	char num4=(char)val4;
	System.out.println(num4);
	
	char val5='A';
	int num5=(char)val5;
	System.out.println(num5);
	
	char val6='d';
	int num6=val6-32;
	char uppercase=(char)num6;
	System.out.println(uppercase);
	
	char val7='D';
	int num7=val7+32;
	char lowercase=(char)num7;
	System.out.println(lowercase);
	
	}
}
	