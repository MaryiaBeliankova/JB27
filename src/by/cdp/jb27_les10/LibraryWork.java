package by.cdp.jb27_les10;

import java.util.List;

public class LibraryWork {

	public static void main(String[] args) {

		Library myBook = new Library();

		myBook.add(new Book("Book1", 2018, 10));
		myBook.add(new Book("Book2", 2017, 8));
		myBook.add(new Book("Book3", 1997, 15));

		Book findBook = myBook.findByContent("Book2");

		if (findBook != null) {
			print(findBook);
		}
		print(myBook);
	}

	public static void print(Library mBook) {
		List<Book> printBooks = mBook.getBooks();

		System.out.println("\nLibrary: ");

		for (int i = 0; i < printBooks.size(); i++) {
			Book book = printBooks.get(i);
			print(book);
		}
	}

	public static void print(Book book) {
		System.out.println("Book : " + book.getTitle() + ", " + book.getYearPublished() + ", " + book.getPrice() + " rubles");
	}
}
