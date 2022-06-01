package Loops;

import java.util.Scanner;

public class celciusConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Converting Farenheit to Celsius");
		System.out.println("Enter degree Farenheit value -");

		Scanner fe = new Scanner(System.in);
		double farenheit = fe.nextDouble();

		System.out.println("Converted value = " + ((farenheit - 32) * 5) / 9 + "  Degree Celsius");

	}

}
