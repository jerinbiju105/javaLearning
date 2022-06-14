package MethodsAndClasses;

public class AmusementParkRide {

	public static void main(String[] args) {

		Person john = new Person();

		john.name = "John";
		john.height = 160;
		john.weight = 70;

		if (john.height < 90 || john.height > 200) {

			System.out.println("You are not eligible for this ride, your height range should be from 90cm to 200cm");

			if (john.weight < 15 || john.weight > 95) {

				System.out
						.println("You are not eligible for this ride, your weight range should be from 15 Kg to 95 Kg");

			}

		}

		else {
			System.out.println("You are eligible, have fun!");
		}

	}

}
