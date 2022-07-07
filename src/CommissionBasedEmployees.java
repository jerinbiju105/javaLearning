package EncapsulationInhertance;

public class CommissionBasedEmployees extends Employee {
	

	public CommissionBasedEmployees(String firstName, String lastName, Double sinNumber, Double salary) {
		super(firstName, lastName, sinNumber, salary);
		
	}

	int completedSales;

	double calculatePay(int completedSales) {
		double salary = super.getSalary();
		this.completedSales = completedSales;
		double totalSalary = salary + (completedSales * 0.15);
		return totalSalary/26;
	}

}
