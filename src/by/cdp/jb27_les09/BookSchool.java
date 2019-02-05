package by.cdp.jb27_les09;

public class BookSchool extends Book {

	private double schYear;
	private String subject;

	public BookSchool(String title, double yearPublished, double price, double schYear, String subject) {
		
		this.schYear=schYear;
		this.subject=subject;
		

	}

	public double getSchYear() {

		double min = 1;
		double max = 11;

		schYear = ((max - min) * Math.random()) + min;

		return schYear;
	}

	public String getSubject() {
		subject = "Mathematics for all";

		return subject;
	}
}
