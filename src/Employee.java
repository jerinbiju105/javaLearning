package MethodsAndClasses;

public class Employee {
	
	String firstName;
	String lastName;
	double hourlyPay;
	double hoursWorked;
	
	
	double calculateSalary (double hour) {
//		hour = hoursWorked;
		return(hourlyPay*hour);
	}


}
