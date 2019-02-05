package by.cdp.jb27_les09;

import java.util.Random;
import java.util.stream.Collectors;

public class Book {
	private String title;
	private double yearPublished;
	private double price;

	public Book() {

	}

	public Book(String title, double yearPublished, double price) {
		this.title = title;
		this.yearPublished = yearPublished;
		this.price = price;
	}

	public String setTitle() {

		int length = 6;
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";

		//this.title=title;
		title = new Random().ints(length, 0, chars.length()).mapToObj(n -> "" + chars.charAt(n))
				.collect(Collectors.joining());

		return title;
	}

	public double getYearPublished(double min, double max) {

		yearPublished = ((max - min) * Math.random()) + min;

		return yearPublished;
	}

	
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public double getPrice(double min, double max) {

		price = ((max - min) * Math.random()) + min;

		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
