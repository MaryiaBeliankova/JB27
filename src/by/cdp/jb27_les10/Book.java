package by.cdp.jb27_les10;

import java.util.Random;
import java.util.stream.Collectors;

public class Book {
	private String title;
	private int yearPublished;
	private double price;

	public Book() {

	}

	public Book(String title, int yearPublished, double price) {
		this.title = title;
		this.yearPublished = yearPublished;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title=title;
		
	}
	
	public void randomTitle () {
		
		int length = 6;
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";

		title = new Random().ints(length, 0, chars.length()).mapToObj(n -> "" + chars.charAt(n))
				.collect(Collectors.joining());		
	
	}
	
	public double getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public void randomYear (int min, int max) {
		yearPublished = (int) (((max - min) * Math.random()) + min);
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void randomPrice(double min, double max) {
		price = ((max - min) * Math.random()) + min;
	}
	

}
