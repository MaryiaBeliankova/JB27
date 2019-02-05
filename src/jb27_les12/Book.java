package jb27_les12;

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
			public int getYearPublished() {
				return yearPublished;
			}

			public void setYearPublished(int yearPublished) {
				this.yearPublished = yearPublished;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}	
			
			@Override
			public String toString() {
				return title + "," + yearPublished + "," + price;
			}
			
	}

