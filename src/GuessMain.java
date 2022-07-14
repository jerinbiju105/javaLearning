package Game;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class GuessMain {

	public static void main(String[] args) {

		try {
			GuessGame game = new GuessGame();

			// Generate random movie title
			game.generateRandomMovie(game.getMovieList());

			for (int i = 1; i < 11; i++) {

				System.out.println("\n enter the letter " + i);
				Scanner sc = new Scanner(System.in);
				char movieLetter = sc.next().charAt(0);
				game.compare(movieLetter);
			}

			game.checkGame();

		}

		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
