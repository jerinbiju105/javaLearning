package test;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * * You take a loan from a friend and need to calculate how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan amount each month. 
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.

Sample Input:
20000

Sample Output:
10628

Here is the monthly payment schedule:
Month 1 
Payment: 10% of 20000 = 2000
Remaining amount: 18000
Month 2
Payment: 10% of 18000 = 1800
Remaining amount: 16200
Month 3:
Payment: 10% of 16200 = 1620
Remaining amount: 14580
		 */
		 
		double balanceAmount = 20000.00;
		double monthlyPayemnt = 0.0;
		System.out.println(" Total amount owed = " +balanceAmount);
		
		for (int month = 1; month <=3; month++) {
			
			monthlyPayemnt = balanceAmount * 0.10;
			
			System.out.println("Month " +month);
			System.out.println("Payment: 10% of " +balanceAmount +" = " +monthlyPayemnt);
			
			balanceAmount=balanceAmount-monthlyPayemnt;
			System.out.println("Remaining amount = " +balanceAmount);
		
		}
		
		
		
		
	}



}


