package intermediateJava;

import java.util.Arrays;

public class differentArrayDeclarations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Array declaration type 1
		
		int [] randomNumbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(randomNumbers));
		
		// Type 2
		
		int [] secondRandomnumbers = new int [10];
		for( int i = 0; i < secondRandomnumbers.length; i++) {
			System.out.println(secondRandomnumbers[i]);
		}
	}

}
