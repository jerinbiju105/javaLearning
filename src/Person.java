package atmPackage;

public class Person {

	private String name;
	private double acNo;
	private double totalFund = 0;
	private int pin;
	private String accType;

	public Person(String name, double acNo, double totalFund, int pin, String accType) {
		this.name = name;
		this.acNo = acNo;
		this.totalFund = totalFund;
		this.pin = pin;
		this.accType = accType;
	}

	String getName() {
		return name;
	}

	double getAcNo() {
		return acNo;
	}

	int getPin() {
		return pin;
	}

	double getTotalFund() {
		return totalFund;
	}

	double withdraw(double amount) {
		totalFund = totalFund - amount;
		return totalFund;
	}

	double deposit(double amount) {
		totalFund = totalFund + amount;
		return totalFund;
	}

}
