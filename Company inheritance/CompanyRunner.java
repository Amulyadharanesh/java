public class CompanyRunner{
	public static void main (String[]args){
		
     Manager manager = new Manager();
     Employee employee = new Employee();
	 Software software = new Software();
	 Data data = new Data();
	 Accounting accounting=new Accounting();
	 Quality quality=new Quality();
		
	Company company = new Company("TCS",2000,manager,employee);
	company.hireEmployee();
	
	IT it = new IT("Infosys",1500,"Bengaluru",false,software,data);
	it.employeeBonus();
	
	IT it1 = new IT("Microsoft",1800,"Bengaluru",false,software,data);
	it1.data.analyzeData();
	
	BPO obj=new BPO("Accenture",3000,"Health insurance",454.6754d,accounting,quality);
	obj.accounting.calculateProfit();
	
	BPO obj1=new BPO("IBM",4000,"Health insurance",554.6754d,accounting,quality);
	obj1.processClientRequest();
	
	
	
	
	
	
	
	}
}

