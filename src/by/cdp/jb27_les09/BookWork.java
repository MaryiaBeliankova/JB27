package by.cdp.jb27_les09;

public class BookWork {

	public static void main(String[] args) {
	

		Book mybook = new Book();
		BookSchool myschbook = new BookSchool("", 0, 0, 0, "");
		BookDictionary mybookdic = new BookDictionary ();

		//get a common book
		System.out.println ("Common book:");
		System.out.println ("---------------");
		System.out.println(mybook.setTitle());
		System.out.println(String.format("%.0f", mybook.getYearPublished(1950, 2018))+ " year");
		System.out.println(String.format("%.2f", mybook.getPrice(5,100)) + " rubles");
		
		//get a school book
		System.out.println ("\nSchool book:");
		System.out.println ("---------------");
		System.out.println(myschbook.getSubject());
		System.out.println(String.format("%.0f", myschbook.getSchYear()) + " class");
		System.out.println(String.format("%.0f", myschbook.getYearPublished(2000, 2018)) + " year");
		System.out.println(String.format("%.2f", myschbook.getPrice(2, 10)) + " rubles");
		
		//get a dictionary
		System.out.println ("\nDictionary book:");
		System.out.println ("---------------");
		System.out.println(mybookdic.setTitle());
		System.out.println(String.format("%.0f", mybookdic.getYearPublished(1998, 2018)) + " year");
		System.out.println(mybookdic.setLanguage());
		System.out.println(String.format("%.2f", mybookdic.getPrice(10, 50)) + " rubles");

	}
}
