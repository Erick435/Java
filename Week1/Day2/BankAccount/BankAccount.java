import java.util.Random;

public class BankAccount {
    
	private double checking = 0;
	private double savings = 0;
	private Long id;
	
	private static int numAccounts = 0;
	private static double totalBalance = 0.0; 
//	if there's a problem, add a "D" at the end of the 0.0
	
	public BankAccount() {
		this.checking = 0;
		this.savings = 0;			//you could use "this" when it's not static
		this.id = genId();
		numAccounts++;
//when using static, you could either leave as it ^^^ or call it "[classname] BankAccount.numAccounts++;"
	}
	
	
	public BankAccount(double checking, double savings) {
		this.checking = checking;
		this.savings = savings;
		this.id = genId();
		numAccounts++;
		totalBalance += checking + savings;
//		BankAccount.numAccounts++;
//		BankAccount.totalBalance += checking + savings;
//Can't use this.numAccounts++ because it's a static 
	}
	
	
	public Long genId() {
//first way
 	Long _id = (long) 0;
		Random random = new Random();		//this is where you need the Random import
		random.nextLong();
		return _id;
		
//second way
//		Long _id = 0;
//		double rnd = Math.random();
//		Long _id = (long) (10000000.0 + (rnd * 999999999 - 100000000.0));
//		return _id;
		
//String way
//		String _id = " ";
//		for (int i = 0; i < 9; i++) {
//			long num = (long) Math.floor(Math.random() * 9);
//			_id += num+" ";
//		}
//		System.out.println(_id);
//		return Long.parseLong(_id);
	}
	
	public void Deposit(Double amount, Boolean accountType) {
		if(accountType) {
			savings += amount;
		}
		else {
			checking += amount;
		}
		totalBalance += amount;
	}
	
	
	public double Withdraw(Double amount, Boolean accountType) {
		if(accountType) {
			if((savings - amount) < 0 ) {
				System.out.println("You do not have funds");
				return 0;
			}
			else {
				savings -= amount;
			}
		}
		else {
			if((checking - amount) < 0) {
				System.out.println("You do not have any funds");
				return 0;
			}
			else {
				checking -= amount;
			}
		}
		return amount;
	}
	
	
	public double getTotal() {
		return checking + savings;
	}
	
	
	
	

	public double getChecking() {
		return checking;
	}

	public void setChecking(double checking) {
		this.checking = checking;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public static int getNumAccounts() {
		return numAccounts;
	}

	public static void setNumAccounts(int numAccounts) {
		BankAccount.numAccounts = numAccounts;
		//because of static, can't use "this", use class name followed by "." (period)
	}

	public static double getTotalBalance() {
		return totalBalance;
	}

	public static void setTotalBalance(double totalBalance) {
		BankAccount.totalBalance = totalBalance;
	}

}
