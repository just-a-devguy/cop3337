/*Adler G Luders
 * COP 3337
 * Assignment 3 - Inheritance
 * 27 January 2024
 */

import java.util.*;

//  Parent Class
class LibraryItem {
	String title;
	String creator;
	int itemId;
	boolean available;

	// Constructor
	public LibraryItem(String title, String creator, int itemId) {
		this.title = title;
		this.creator = creator;
		this.itemId = itemId;
	}

	// Methods
	void checkoutItem() {
		System.out.println("checkout");
	}

	void returnItem() {
		System.out.println("return");
	}

	boolean isAvailable() {
		return true;
	}

	int getItemId() {
		return itemId;
	}
}

// Book Child
class Book extends LibraryItem {
	// Attributes
	String genre;
	int numberOfPages;

	// Constructor
	public Book(String title, String creator, int itemId, String genre, int numberOfPages) {
		super(title, creator, itemId);
		this.genre = genre;
		this.numberOfPages = numberOfPages;
	}
}

// DVD Child
class DVD extends LibraryItem {
	// Attributes
	String director;
	int duration;

	// Constructor
	public DVD(String title, String creator, int itemId, String director, int duration) {
		super(title, creator, itemId);
		this.director = director;
		this.duration = duration;
	}
}

// LibraryMember
class LibraryMember {
	String name;
	String address;
	String contact;
	int memberId;
	LibraryItem[] borrowedItems;
	double fines;

	// Constructor
	public LibraryMember(String name, String address, String contact, int memberId) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.memberId = memberId;
		this.borrowedItems = new LibraryItem[1000];
		this.fines = 0.0;
	}

	// Methods
	void borrowItem(LibraryItem item) {
		System.out.println("item borrowed");
	}

	void returnItem(LibraryItem itm) {
		System.out.println("item return");
	}
}

public class Library {
	LibraryItem[] items;
	LibraryMember[] members;

	public Library() {
		this.items = new LibraryItem[1000];
		this.members = new LibraryMember[1000];
	}

	// Methods
	void addItem(LibraryItem item) {
		List<LibraryItem> x = new ArrayList<LibraryItem>(Arrays.asList(items));

		x.add(item);

		items = x.toArray(items);

		System.out.println("added " + items.length);
	}

	void addMember(LibraryMember member) {
		System.out.println("member");
	}

	static void printMenu() {
		System.out.println("1. Add Item");
		System.out.println("2. Add Member");
		System.out.println("3. Borrow Item");
		System.out.println("4. Return Item");
		System.out.println("5. Display Library");
		System.out.println("6. Exit");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Library library = new Library();
		int userInput;

		printMenu();
		while (true) {

			System.out.println("Enter your choice: ");
			userInput = scan.nextInt();

			if (userInput == 6) {
				System.out.println("Exiting...");
				break;
			} else if (userInput == 1) {
				// Add item to library
				String title;
				String creator;
				int id;
				String type;
				String genre;
				int numberOfPages;
				String director;
				int duration;

				System.out.println("Enter title: ");
				title = scan.nextLine();

				System.out.println("Enter creator: ");
				creator = scan.nextLine();

				System.out.println("Enter item ID: ");
				id = scan.nextInt();

				System.out.println("Is it a book or a DVD (B/D) ");
				type = scan.nextLine();

				if (type.toUpperCase() == "B") {
					System.out.println("Enter genre: ");
					genre = scan.nextLine();

					System.out.println("Enter number of pages: ");
					numberOfPages = scan.nextInt();

					Book book = new Book(title, creator, id, genre, numberOfPages);
					library.addItem(book);

				} else if (type.toUpperCase() == "D") {
					System.out.println("Enter director name: ");
					director = scan.nextLine();

					System.out.println("Enter duration: ");
					duration = scan.nextInt();

					DVD dvd = new DVD(title, creator, id, director, duration);
					library.addItem(dvd);
				} else {
					System.out.println("Invalid entry");
				}

				printMenu();
			} else if (userInput == 2) {
				// Add member to library
				String name;
				String address;
				String contact;
				int memberId;
				// LibraryItem borrowedItems[];

				System.out.println("Enter member name: ");
				name = scan.nextLine();

				System.out.println("Enter member address: ");
				address = scan.nextLine();

				System.out.println("Enter contact information: ");
				contact = scan.nextLine();

				System.out.println("Enter member ID: ");
				memberId = scan.nextInt();

				LibraryMember member = new LibraryMember(name, address, contact, memberId);
				library.addMember(member);

				printMenu();
			} else if (userInput == 3) {
				// Run code to borrow item
				printMenu();
			} else if (userInput == 4) {
				// Run code to return an item
				printMenu();
			} else if (userInput == 5) {
				// display library
				System.out.println("Library: Items " + library.items.length + ", Members: " + library.members.length);
				printMenu();
			} else {
				System.out.println("Enter a valid query");
				printMenu();
			}
		}
		scan.close();

	}
}