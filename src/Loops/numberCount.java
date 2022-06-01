package Loops;

import java.util.Scanner;

public class numberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input any numbers!");

		Scanner co = new Scanner(System.in);

		int number = co.nextInt();
		int count = 0;

		while (number > 0) {
			number = number / 10;
			count++;

		}

		System.out.println("Number of digits = " + count);

	}

}
