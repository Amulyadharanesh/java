public class Positive{
  public static void main(String[] args)
   {
	double value=Math.abs(-67.9);  
    System.out.println(value);//method returns the absolute (positive) value
  }

  {
	  double value1=Math.random();
	  System.out.println(value1);// returns a random number between 0.0 and 1.0
  }

  {
	  double value2=Math.sin(30);
	  System.out.println(value2);//Returns the trigonometric sine of an angle
  }
  
  {
	  double value3=Math.scalb(8.8568d,476);
	  System.out.println(value3);//Returns d × 2^scaleFactor
  }

  {
	  double value4=Math.ulp(67.6896d);
	  System.out.println(value4);//Returns the size of an ulp(unit in the last place) of the argument
  }
}