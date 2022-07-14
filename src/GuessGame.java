package Game;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GuessGame {

	private String randomMovie;
	int NoOfWins = 0;
	int noOfWrongs = 0;
	String result = "";
	StringBuilder myName;

	// fetching data from movies.txt

	String[] getMovieList() throws FileNotFoundException {
		File movieDatabase = new File("/Users/jerin/Downloads/movies.txt");
		Scanner movieDatabaseScanner = new Scanner(movieDatabase);
		StringBuilder movieListReader = new StringBuilder();
		while (movieDatabaseScanner.hasNextLine()) {
			movieListReader.append(movieDatabaseScanner.nextLine());
			movieListReader.append("\n");
		}
		movieDatabaseScanner.close();
		return movieListReader.toString().trim().split("\n");
	}

	void generateRandomMovie(String[] movies) {
		int movieIndex = (int) (Math.random() * movies.length);
		randomMovie = movies[movieIndex].replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
		System.out.println(randomMovie);
		int c = randomMovie.length();
		for (int j = 0; j < c; j++) {
			result = result + "*";
		}
		myName = new StringBuilder(result);
	  ////System.out.println(result);
	}

	void compare(char Lvalue) {
		int index = randomMovie.indexOf(Lvalue);
		if (index == -1) {
			System.out.println("***wrong answer***");
			noOfWrongs = noOfWrongs + 1;
		} else {
               System.out.println("***good guess***");
			NoOfWins = NoOfWins + 1;
           
			myName.setCharAt(index, Lvalue);

			System.out.println(myName);

		}
	}

	void checkGame() {

		if (NoOfWins == 0) {
			System.out.println("Sorry not a winner");

		} else {
			System.out.println("********Congragulations . you have won!******");

		}
	}

}