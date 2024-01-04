public class Methods{
public static void main (String[]args){

String value="                 Hiii   ";//checks whether a string is empty or not
String value1="";
System.out.println(value.isEmpty());
System.out.println(value1.isEmpty());

System.out.println(value);
System.out.println(value.trim());//removes whitespace from both ends of a string

int a=50;
String val=String.valueOf(a);//converts different types of values into string
System.out.println(val+10);

String value2="Amulya";//method returns a part of the string
System.out.println(value2.substring(0));//goes 0 to end
System.out.println(value2.substring(1,4));//the beginIndex starts from 0, whereas the endIndex starts from 1.

String value3=("Coffee is a emotion");//replaces the first substring of this string that matches the given regular expression with the given replacement
String str1=value3.replaceFirst("Coffee","Kaapi");
System.out.println(str1);

String str="Ice Cream";
boolean equalIgnoreValue=str.equalsIgnoreCase("VANILLA");//Compares this String to another String, ignoring case considerations
System.out.println(equalIgnoreValue);

boolean endValue=value2.endsWith("a");
System.out.println(endValue);

boolean startValue=value2.startsWith("A");
System.out.println(startValue);

String str2=value3.toLowerCase();
System.out.println(str2);

String str3=value3.toUpperCase();
System.out.println(str3);

}
}






