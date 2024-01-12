public class IT extends Company{
	
	String headquartersLocation;
	boolean isPubliclyTraded;
	Software software;
	Data data;
	


void employeeBonus(){

System.out.println("Employees getting Bonus");	
	
}

void financialReport(){
	
System.out.println("Employees getting financial Report");		
	
}

IT(){
	
}

public IT(String companyName,int numberOfEmployees,String headquartersLocation,boolean isPubliclyTraded,Software software,Data data){
	this.companyName=companyName;
	this.numberOfEmployees=numberOfEmployees;
	this.headquartersLocation=headquartersLocation;
	this.isPubliclyTraded=isPubliclyTraded;
	this.software=software;
	this.data=data;
	
}
}