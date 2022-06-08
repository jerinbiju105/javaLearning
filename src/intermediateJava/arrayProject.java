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
		String[] googleArray = { "1: Google Pixel 6", "2: Google Pixel 6 Pro", "3: Google Pixel Pro",
				"4: Google Pixel 5" };
		String[] samsungArray = { "1: S20", "2: S21", "3: Flip 3", "4: Fold 3" };

		// Switch

		switch (brandName) {
		case "Apple": {
			System.out.println("Available phones - " + Arrays.toString(appleArray));

		}

			System.out.println("Enter product name from the above list.");
			Scanner ap = new Scanner(System.in);
			String productName = ap.nextLine();

			for (int i = 0; i < 4; i++) {

				System.out.println(appleArray[i]);
				if (appleArray[i].equals(productName)) {
					System.out.println("You have selected " + productName);
					break;
				}
			}

		case "Google": {
			System.out.println("Available phones - " + Arrays.toString(googleArray));
			break;
		}

		case "Samsung": {
			System.out.println("Available phones - " + Arrays.toString(samsungArray));
			break;
		}

		default:
			System.out.println("Not available!");
			break;
		}

	}

}
