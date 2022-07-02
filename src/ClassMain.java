package atmPackage;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {

		// Main variables

		int option = 0;
		double amount = 0;
		int pin = 0;
		double withdrawalAmount = 0;
		double depositAmount = 0;

		// Objects

		Atm halifaxAtm = new Atm();
		Person person1 = new Person("Jerin", 1001, 1500, 2050, "Savings");

		// User facing programs
		do {
			System.out.println();
			System.out.println("Enter your option");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Balance Enquiry");
			System.out.println("4. Exit");

			// Scanner to enter options

			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();

			// Beginning of switch cases

			switch (option) {

			// Case 1 - Withdrawal

			case 1:
				System.out.println("Enter your PIN to continue");
				pin = sc.nextInt(); // Enter Pin

				if (pin == person1.getPin()) {
					System.out.println("Enter the amount to be withdrawn");

					amount = sc.nextDouble(); // Enter Withdraw amount

					withdrawalAmount = withdrawalAmount + amount; // To limit daily transaction
					if (withdrawalAmount >= 1000) {
						System.out.println("Daily limit exceeded! ");
					} else {
						halifaxAtm.withdrawCash(person1, amount);
						System.out.println("Balance amount = " + person1.getTotalFund());

					}

					break;

				}

				else {
					System.out.println("You have entered wrong Pin");
				}
				break;

			// Case 2 - Deposit

			case 2:

				System.out.println("Enter your PIN to continue");
				pin = sc.nextInt();

				if (pin == person1.getPin()) {
					System.out.println("Enter the amount to be deposited");
					amount = sc.nextDouble();
					depositAmount = depositAmount + amount;

					if (depositAmount >= 1000) {
						System.out.println("Daily limit exceeded! ");
					}

					else {
						halifaxAtm.depositCash(person1, amount);
						System.out.println("Balance amount = " + person1.getTotalFund());
					}

					break;

				}

				else {
					System.out.println("You have entered wrong Pin");
				}
				break;

			// Case 3 for displaying Balance

			case 3:
				System.out.println("Enter your PIN to continue");
				pin = sc.nextInt();
				if (pin == person1.getPin()) {
					System.out.println("Balance  = " + person1.getTotalFund());
					break;
				}

				else {
					System.out.println("You have entered wrong Pin");
				}
				break;

			default:
				break;
			}

		} while (option == 1 || option == 2 || option == 3);

	}

}
