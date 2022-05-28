package test;

public class licenseProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nameOfPerson = "Jane";
		String currentLicense = "g1";
		String licenseOne = "None";
		String licenseTwo = "G1";
		String licenseThree = "G2";
		String licenseFour = "G";

		int age = 18; // age of person

		if (age >= 16) {
			if (currentLicense.equals(licenseTwo)) {
				System.out.println("Jane Is eligible for G2");
			}

			else if (currentLicense.equals(licenseThree)) {
				System.out.println("Jane is eligible for G");
			} else if (currentLicense.equals(licenseFour)){
				System.out.println("You are at maximum level");
			} else {
				System.out.println("Please take the test for G1 license");
			}

		} else {
			System.out.println("you need to be atleast 16 years old to be eligible");
		}

	}

}
