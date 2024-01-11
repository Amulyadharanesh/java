public class BPO extends Company{
	
	String serviceOffered;
    double revenue;
	Accounting accounting;
	Quality quality;
	
	


void calculateTaxes(){
	
	System.out.println("Calculate the taxes");
	
}

void processClientRequest(){
	
	System.out.println("Processing the Client Request");
	
}

BPO(){
	
}

public BPO(String companyName,int numberOfEmployees,String serviceOffered,double revenue,Accounting accounting,Quality quality){
	
	this.serviceOffered=serviceOffered;
	this.revenue=revenue;
	
}
}

