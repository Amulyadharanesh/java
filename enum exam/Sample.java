public class Sample{

Planets planets;
Days days;
Directions directions;
Seasons seasons;
Color color;
TrafficLight trafficLight;
Size clothSize;
Coffee types;
Month month;
BloodGroup bloodGroup;

Sample(Planets planets,Days days,Directions directions,Seasons seasons,Color color,TrafficLight trafficLight,Size clothSize,Coffee types,Month month,BloodGroup bloodGroup)

{
this.planets=planets;
this.days=days;
this.directions=directions;
this.seasons=seasons;
this.color=color;
this.trafficLight=trafficLight;
this.clothSize=clothSize;
this.types=types;
this.month=month;
this.bloodGroup=bloodGroup;
}

public void display()

{

System.out.println("Planets are:" +planets);
System.out.println("Days are:" +days);
System.out.println("Directions are:" +directions);
System.out.println("Seasons are:" +seasons);
System.out.println("Color are:" +color);
System.out.println("TrafficLight are:" +trafficLight);
System.out.println("Cloth size is:" +clothSize);
System.out.println("Coffee Type is:" +types);
System.out.println("Months are:" +month);
System.out.println("BloodGroup are:" +bloodGroup);

}
}




