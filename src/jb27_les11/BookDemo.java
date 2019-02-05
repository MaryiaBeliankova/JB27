package jb27_les11;

import java.util.HashSet;
import java.util.TreeSet;

public class BookDemo {
	public static void main(String[] args) {

		Book b1 = new Book("Fairy Tales", 1997, 10);
		Book b2 = new Book("Java for beginners", 1995, 15);
		Book b3 = new Book("Mathematics", 1990, 12);
		Book b4 = new Book("English Dictionary", 2018, 55);

		HashSet<Book> bookSet = new HashSet<>();

		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		System.out.println(bookSet);

		// Sort by Price
		TreeSet<Book> bookTreeSet = new TreeSet<>();
		bookTreeSet.add(b1);
		bookTreeSet.add(b2);
		bookTreeSet.add(b3);
		bookTreeSet.add(b4);
		System.out.println(bookTreeSet);

	}
}
