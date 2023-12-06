public class College{

public static void main (String[] args)
{
	System.out.println("Malnad College Of Engineering");
	Electronics();
	Production();
	Electrical();
	Information();
	System.out.println ("Department");
}
static void Electronics(){
	Computer();
	System.out.println("Electronics and Instrumentation");
}
static void Computer(){
	Artifical();
	System.out.println("Computer Sciecnce");
}
static void Artifical(){
	System.out.println("Artifical Inteligance");
}
static void Production (){
	Mechanical();
	System.out.println("Industrial Production");
}
static void Mechanical(){
	Civil();
	System.out.println("Mechanical Engineering");
}
static void Information(){
	System.out.println("Information Science");
}
static void Civil(){
	System.out.println("Civil Engineering");
}
static void Electrical(){
	System.out.println("EEE");
}
}


