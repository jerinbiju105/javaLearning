package test;

public class covidRestrictions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfPeopleInside = 0;
		
		//starting a loop till 50

		while (numberOfPeopleInside <= 50) {
			System.out.println("Current number of people inside - " + numberOfPeopleInside);

			if (numberOfPeopleInside == 50) {
				System.out.print("Maximum limit reached ! ");
			}

			numberOfPeopleInside++;

		}

	}

}
