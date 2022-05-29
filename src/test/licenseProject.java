package test;

import java.util.Scanner;

public class licenseProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nameOfPerson = "Jane"; // name of the person
		String currentLicense = ""; // Current License type

		System.out.println("Current License Type - "); // For entering the current License type

		Scanner sc = new Scanner(System.in); // Scanner variable added

		currentLicense = sc.next();

		// Scanner code for age

		System.out.println("Age of the person - "); // For entering the age

		Scanner sn = new Scanner(System.in); // Scanner variable added

		int age = sn.nextInt();
		
		//beginning of if conditions

		if (age >= 16) {
			if (currentLicense.equals("G1")) {
				System.out.println("Jane Is eligible for G2");
			}

			else if (currentLicense.equals("G2")) {
				System.out.println("Jane is eligible for G");
			} else if (currentLicense.equals("G")) {
				System.out.println("You are at maximum level");
			} else {
				System.out.println("Please take the test for G1 license");
			}

		} else {
			System.out.println("you need to be atleast 16 years old to be eligible");
		}

		sc.close();
	}

}
