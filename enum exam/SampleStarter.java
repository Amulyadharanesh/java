public class SampleStarter{

public static void main (String[]args){


Sample obj=new Sample(Planets.MERCURY,Days.SATURDAY,Directions.NORTH,Seasons.WINTER,Color.LAVENDER,TrafficLight.GREEN,Size.SMALL,Coffee.ESPRESSO,Month.MAY,BloodGroup.A_POSITIVE);
obj.display();

System.out.println(obj.planets.values);
System.out.println(obj.days.values);
System.out.println(obj.directions.values);
System.out.println(obj.seasons.values);
System.out.println(obj.color.values);
System.out.println(obj.trafficLight.values);
System.out.println(obj.clothSize.values);
if(obj.types.values=="Strong")
{
	System.out.println("Coffee is ESPRESSO");
}

else
{
	
	System.out.println("Coffe is not ESPRESSO ");
}
System.out.println(obj.month.values);
System.out.println(obj.bloodGroup.values);

}
}