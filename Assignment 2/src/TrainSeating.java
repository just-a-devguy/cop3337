/**
 * Adler G Luders
 * COP 3337
 * Assignment 2
 * 16 January, 2024
 */

// Display initial seat pattern [1 A B C D]
// Ask user to "Enter seat row (1-5) and column (A - D) or 'Q' to quit: ___
// Display message that the program is quit
// If input is available, put an X there and inform the user that the seat was assigned
// If not, let user know "Seat is taken, please try again"

// Watch for: invalid entries: Let user know this seat is not valid

import java.util.*;

public class TrainSeating {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		int rows = 4;
		int cols = 4;

		char[][] seating = {
				{ 'A', 'B', 'C', 'D' },
				{ 'A', 'B', 'C', 'D' },
				{ 'A', 'B', 'C', 'D' },
				{ 'A', 'B', 'C', 'D' }
		};

		System.out.println("Initial seat pattern: ");
		for (i = 1; i < rows + 1; i++) {
			for (j = 0; j < cols; j++) {
				System.out.print(i++);
				System.out.println(seating[j]);
			}
		}

		while (true) {
			System.out.println("Enter seat row (1-5) and column (A-D) or 'Q' to quit: ");
			String userInput = scan.nextLine();
			System.out.println("inputed: ");
			System.out.println(userInput);

			// check if user asks to quit
			if (Objects.equals(userInput.toUpperCase(), "Q")) {
				break;
			}

			// ensure user entry has the right amount of characters
			if (userInput.length() < 2) {
				System.out.println("Invalid Entry");
			}

			// split the input from the user
			// int firstPart = int(userInput.charAt(0));

			// System.out.println(userInput.charAt(0));
			int firstPart = (userInput.charAt(0) - 1) - '0';

			char[] specificRow = seating[firstPart];

			// loop through the row and check if any of them match the value of charAt 1
			System.out.println("This is row: " + firstPart);
			for (i = 0; i < specificRow.length; i++) {
				System.out.println(specificRow[i]);

				if (specificRow[i] == userInput.charAt(1)) {
					specificRow[i] = 'X';

				}
			}

			for (i = 1; i < rows + 1; i++) {
				for (j = 0; j < cols; j++) {
					System.out.println(seating[j]);
				}
			}

			// System.out.println(firstPart);

			// System.out.println(seating[firstPart]);

			// first part should look at the index of the first part of the array

			// second part look at the column
		}

		System.out.println("Exiting program.");
	}

}
