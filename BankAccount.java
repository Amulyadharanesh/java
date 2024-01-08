public class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;
    boolean isAccountEnabled;
    boolean isAccountLocked;
    boolean isInterestCompounded;
	
	

    public void deposit() {
        
        System.out.println("Amount is Deposited ");
    }

    public void withdraw() {
        
            System.out.println("Withdrawn $" );
        
    }

    public void applyInterest() {
        
            System.out.println("Interest applied");
        }
		
		public BankAccount(long accountNumber,String accountHolderName,double balance,boolean isAccountEnabled,boolean isAccountLocked) {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.isAccountEnabled=isAccountEnabled;
		this.isAccountLocked=isAccountLocked;
    }


    

    public static void main(String[] args) {
       BankAccount accunt = new BankAccount(12346257364L,"AMULYA",4646.5753d,true,true);
        accunt.deposit();
		accunt.withdraw();
        accunt.applyInterest();
        
       
    }

}

