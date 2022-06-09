package intermediateJava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class arrayProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Enter the phone brand name

		System.out.println("Enter phone brand (Available brands - Apple, Google, Samsung");
		Scanner br = new Scanner(System.in);
		String brandName = br.next();

		// Array for different phones
		String[] appleArray = { "iPhone 11", "iPhone 11 Pro", "iPhone 12 mini", "iPhone 12" };
		String[] googleArray = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
		String[] samsungArray = { "S20", "S21", "Flip 3", "Fold 3" };

		// Switch
		boolean rightProduct = false;
		switch (brandName) {

		// Apple

		case "Apple": {
			System.out.println("Available phones - " + Arrays.toString(appleArray));

			// Enter Apple product name

			System.out.println("Enter product name from the above list.");
			Scanner ap = new Scanner(System.in);
			String appleProd = ap.nextLine();

			for (int i = 0; i < 4; i++) {

//			
				if (appleArray[i].equals(appleProd)) {
					System.out.println("You have selected " + appleProd);
					rightProduct = true;
					break;
				}

			}

			if (rightProduct == false) {
				System.out.println("Enter product from the list");
				break;
			}

			break;

		}

		// Google

		case "Google": {
			System.out.println("Available phones - " + Arrays.toString(googleArray));

			// Enter Google product name

			System.out.println("Enter product name from the above list.");
			Scanner gg = new Scanner(System.in);
			String googleProd = gg.nextLine();

			for (int i = 0; i < 4; i++) {

				if (googleArray[i].equals(googleProd)) {
					System.out.println("You have selected " + googleProd);
					rightProduct = true;
					break;

				}

			}

			if (rightProduct == false) {
				System.out.println("Enter product from the list");
				break;
			}

			break;
		}

		// Samsung

		case "Samsung": {
			System.out.println("Available phones - " + Arrays.toString(samsungArray));

			// Enter Samsung product name

			System.out.println("Enter product name from the above list.");
			Scanner sm = new Scanner(System.in);
			String samsungProd = sm.nextLine();

			for (int i = 0; i < 4; i++) {

				if (samsungArray[i].equals(samsungProd)) {
					System.out.println("You have selected " + samsungProd);
					rightProduct = true;
					break;

				}

			}

			if (rightProduct == false) {
				System.out.println("Enter product from the list");
				break;
			}
			break;
		}

		default:
			System.out.println("Enter a valid Brand name");
			break;

		}

	}
}
