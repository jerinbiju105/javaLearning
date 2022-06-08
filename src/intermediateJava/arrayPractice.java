package intermediateJava;

import java.util.Arrays;

public class arrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] randomNumbers = { "5", "2", "3", "4", "5", "6", "7" };
		System.out.println("Random Numbers displayed " + Arrays.toString(randomNumbers));

		int index = 0;

		int counter = 0;

		int[] indexArray = new int[randomNumbers.length];

		for (int i = 0; i < randomNumbers.length; i++) {

			if (randomNumbers[i].equals("5")) {
				index = i;
				indexArray[counter] = i;
				counter++;
				System.out.println("Index at which 5 is stored : " + index);

				
			}
		}
		
		System.out.println("5 exists at indexs "+Arrays.toString(indexArray));
	}
}
