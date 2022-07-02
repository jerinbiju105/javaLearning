package atmPackage;

public class Atm {
	
	
	//methods for deposit and withdrawal
	
	void withdrawCash (Person person1, double amount) {
		
		if (person1.getTotalFund() < amount) {
			System.out.println("Tranction cannot be processed");
		}
		else {
			person1.withdraw(amount);
		}
	}
		
	void depositCash (Person person1, double amount) {
		
		if (amount<0) {
			System.out.println("Tranction cannot be processed");
		}
		else {
			person1.deposit(amount);
		}
		
		
		
		
		
	}
	
}
