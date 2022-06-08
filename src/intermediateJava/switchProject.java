package intermediateJava;

import java.util.Scanner;

public class switchProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome!

		System.out.println("Calculator");

		// Input first number

		System.out.println("Enter a digit!");
		Scanner sc = new Scanner(System.in);
		double firstNumber = sc.nextDouble();

		// Input second number

		System.out.println("Now, enter second digit!");
		Scanner sn = new Scanner(System.in);
		double secondNumber = sc.nextDouble();

		// Input the operation which should be executed

		System.out.println("Enter the operation which should be executed."
				+ " Please use - \n 1:Add \n 2:Subtract \n 3: Multiply \n4 Divide");
		Scanner op = new Scanner(System.in);
		int operator = op.nextInt();

		double result = 0;
		// Switch code

		switch (operator) {
		case 1: {
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + " + " + secondNumber + " =" + result);
			break;
		}

		case 2: {
			result = firstNumber - secondNumber;
			System.out.println(firstNumber + " - " + secondNumber + " =" + result);
			break;
		}

		case 3: {
			result = firstNumber * secondNumber;
			System.out.println(firstNumber + " * " + secondNumber + " =" + result);
			break;
		}

		case 4: {
			result = firstNumber / secondNumber;
			System.out.println(firstNumber + " / " + secondNumber + " =" + result);
			break;
		}

		default:
			System.out.println("Enter valid number!");
			break;

		}

	}

}
