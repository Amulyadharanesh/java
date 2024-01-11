public class Company{

String companyName;
int numberOfEmployees;
Manager manager;
Employee employee;

void hireEmployee(){
	
	System.out.println("Hiring the Employee salary");

}

void fireEmployee() {
	
System.out.println("Fire the Employee");
	

}

Company(){
	
}
public Company(String companyName,int numberOfEmployees,Manager manager,Employee employee){
	
this.companyName=companyName;
this.numberOfEmployees=numberOfEmployees;
this.manager=manager;
this.employee=employee;

}
}

