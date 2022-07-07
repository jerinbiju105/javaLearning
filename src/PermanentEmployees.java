package EncapsulationInhertance;

public class PermanentEmployees extends Employee {

	public PermanentEmployees(String firstName, String lastName, Double sinNumber, Double salary) {
		super(firstName, lastName, sinNumber, salary);
		// TODO Auto-generated constructor stub
	}

	double calculatePay() {
		double salary = super.getSalary();
		// calculate salary biweekly
		return salary / 26;
	}

}
