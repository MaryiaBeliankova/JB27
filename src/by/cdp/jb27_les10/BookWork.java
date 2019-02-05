package by.cdp.jb27_les10;

public class BookWork {


	public static void main(String[] args) {

		String str = "", str1 = "", str2 = " ";

		Book[] mybook = new Book[5];

		for (int i = 0; i < mybook.length; i++) {

			mybook[i] = new Book();

			mybook[i].randomTitle();
			mybook[i].randomYear(1950, 2018);
			mybook[i].randomPrice(10, 100);

			str1 = String.format("%.2f", mybook[i].getPrice()) + " rubles";
			str2 = String.format("%.0f", mybook[i].getYearPublished());

			str = mybook[i].getTitle() + " book written in " + str2 + " costs " + str1;

			System.out.println(str);
		}

	}

}
