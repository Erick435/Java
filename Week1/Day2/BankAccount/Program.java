
public class Program {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(100.25, 4000);
		
		account1.Deposit(400.0, false);	//deposits in the checking
		System.out.println(account1.getChecking());
		account1.Withdraw(250.75, false); //withdraws from checking
		System.out.println(account1.getChecking());
		account1.Withdraw(10000.0, false);
		System.out.println(account1.getChecking());
		
		
		account2.Deposit(1200.50, true); //deposits in savings
		System.out.println(account2.getSavings());
		account2.Withdraw(632.75, true); //withdraws from savings
		System.out.println(account2.getSavings());
		account2.Withdraw(50000.0, true);
		System.out.println(account2.getSavings());	//Withdraws from savings
		
	}
	
}
