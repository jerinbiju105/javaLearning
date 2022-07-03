package Classwork;

public class BankMain {

	public static void main(String[] args) {

		Chequing chqAccount = new Chequing();
		chqAccount.depositMoney(1000);

		Savings svngAccount = new Savings();
		svngAccount.depositMoney(2000);

		Tfsa tfsa = new Tfsa();
		tfsa.depositMoney(5000);

		
		
		
		Account cxAccount = new Account();
	

		boolean isAuthorised = cxAccount.authorization(1234, "Chequing");

		if (isAuthorised ==true) {
			System.out.println("Balance in chequing : " + chqAccount.balance);
		}

		else {
			System.out.println("Transaction declined!");
		}

		boolean isAuthorised2 = cxAccount.authorization(3456, "Saving");

		if (isAuthorised2 ==true) {
			System.out.println("Balance in savings : " + svngAccount.balance);
		}

		else {
			System.out.println("Transaction declined!");
		}

		
		
		boolean isAuthorised3 = cxAccount.authorization(6666, "TFSA");

		if (isAuthorised3 ==true) {
			System.out.println("Balance in chequing : " + tfsa.balance);
		}

		else {
			System.out.println("Transaction declined!");
		}

//		System.out.println("Balance in Saving : " + svngAccount.balance);
//
//		System.out.println("Balance in TFSA : " + tfsa.balance);
	}

}
