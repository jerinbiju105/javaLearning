package Loops;

import java.util.Scanner;

import test.forLoop;

public class changeOfCodeInQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Converting Farenheit to Celsius");
		System.out.println("Enter degree Farenheit value -");

		Scanner fe = new Scanner(System.in);
		double farenheit = fe.nextDouble();

		if (farenheit == 0) {

			System.out.println("Celsius      farenheit");
			int j = -20;

			while (j <= 25) {
				int ans = (j * 9 / 5) + 32;
				System.out.println(j + "           " + ans);
				j = j + 5;

			}

		}

		else {
			System.out.println("Converted value = " + ((farenheit - 32) * 5) / 9 + "  Degree Celsius");
		}

	}

}
