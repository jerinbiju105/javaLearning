package MethodsAndClasses;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.firstName = "John";
		e1.lastName = "Doe";
		e1.hourlyPay = 15.00;

		System.out.println("Enter the hours worked.");

		Scanner sc = new Scanner(System.in);
		e1.hoursWorked = sc.nextDouble();

		double totalSalary = e1.calculateSalary(e1.hoursWorked);

		System.out.println("Total salary =" + totalSalary);

	}

}
