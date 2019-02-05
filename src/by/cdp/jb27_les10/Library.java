package by.cdp.jb27_les10;

import java.util.ArrayList;
import java.util.List;

public class Library {
		private List<Book> books = new ArrayList<Book>();

	public Library() {
	}

	public List<Book> getBooks() {
		return books;
	}

	public void add(Book book) {
		books.add(book);
	}

	public boolean delete(Book book) {
		return books.remove(book);
	}

	public Book findByContent(String content) {
		for (Book book : books) {
			if (book.getTitle().equals(content)) {
				return book;
			}
		}
		return null;
	}

	}

