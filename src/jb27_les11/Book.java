package jb27_les11;

public class Book implements Comparable<Book> {
	private String title;
	private int yearPublished;
	private int price;

	public Book(String title, int yearPublished, int price) {
		this.title = title;
		this.yearPublished = yearPublished;
		this.price = price;
	}

	public int getYear() {
		return yearPublished;
	}

	public int getPrice() {
		return price;
	}

	public int compareToY(Book anotherBook) {
		int anotherBookYear = anotherBook.getYear();
		return this.yearPublished - anotherBookYear;
	}

	public int compareTo(Book anotherBook) {
		int anotherBookPrice = anotherBook.getPrice();
		return this.price - anotherBookPrice;
	}

	public String toString() {
		return getClass().getSimpleName() + ": Title = " + title + ", Published year = " + yearPublished + ", Price = "
				+ price+"\n";
	}
}
