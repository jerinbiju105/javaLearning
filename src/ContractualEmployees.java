package EncapsulationInhertance;

public class ContractualEmployees extends Employee {

	

	public ContractualEmployees(String firstName, String lastName, Double sinNumber, Double salary) {
		super(firstName, lastName, sinNumber, salary);
		
	}

	double calculatePay(double hours) {
		double totalSalary;
		double salary = super.getSalary();
		if (hours>40)
		{
			double hoursExtra=hours-40;
			double extraHourPay=hoursExtra*(salary*1.5);
			totalSalary=extraHourPay+(salary*40);
		
		}
		else
		{
		 totalSalary = salary * hours;
		}
		return totalSalary;
	}

}
