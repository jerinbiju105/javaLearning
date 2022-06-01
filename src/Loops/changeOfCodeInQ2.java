package Loops;

import java.util.Scanner;

public class changeOfCodeInQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Converting Farenheit to Celsius");
		System.out.println("Enter degree Farenheit value -");

		Scanner fe = new Scanner(System.in);
		double farenheit = fe.nextDouble();

		if (farenheit == 0) {
			System.out.println("Celsius     Fahrenheit\n"
					+ "\n"
					+ "-20.00        -4.00\n"
					+ "-15.00         5.00\n"
					+ "-10.00        14.00\n"
					+ "\n"
					+ "-5.00        23.00\n"
					+ " 0.00        32.00\n"
					+ " 5.00        41.00\n"
					+ "\n"
					+ "10.00        50.00\n"
					+ "15.00        59.00\n"
					+ "20.00        68.00\n"
					+ "25.00        77.00");
		}

		else {
			System.out.println("Converted value = " + ((farenheit - 32) * 5) / 9 + "  Degree Celsius");
		}

	}

}
