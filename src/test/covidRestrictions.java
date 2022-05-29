package test;

import java.util.Scanner;

public class covidRestrictions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maximumNumberAllowed = 50;
		int peopleInsideStore = 45;

		// Scanner for people entering the store
		System.out.println("Number of people entering - "); // Scanner for number of people entering

		Scanner se = new Scanner(System.in); // Scanner variable added

		int numberofPeopleEntering = se.nextInt();
		int totalNumberInside = peopleInsideStore + numberofPeopleEntering;


		while (totalNumberInside <= maximumNumberAllowed) {

			System.out.println("Number of people inside the store = " + totalNumberInside);
			break;
			
		}
			
			if (totalNumberInside >= maximumNumberAllowed) {
				System.out.println("Sorry, maximum limit reached!");

			}

		}

	}

