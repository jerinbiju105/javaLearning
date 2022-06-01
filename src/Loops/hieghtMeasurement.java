package Loops;

import java.awt.dnd.DnDConstants;
import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class hieghtMeasurement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Your hieght (foot) - ");
		Scanner sc = new Scanner(System.in);
		double foot = sc.nextDouble();

		System.out.println("Your hieght (inches) - ");
		Scanner si = new Scanner(System.in);
		double inches = si.nextDouble();

		double centimetersForFoot = foot * 30.48;
		System.out.println("Foot in cm = " + centimetersForFoot + "cm");

		double centimetersForInches = inches * 2.54;
		System.out.println("Inches in cm = " + centimetersForInches + "cm");

	}

}
