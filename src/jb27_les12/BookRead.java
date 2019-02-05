package jb27_les12;

import java.io.*;
import java.util.ArrayList;

public class BookRead {

	public static void main(String args[]) throws IOException {

		ArrayList<Book> before = new ArrayList<Book>();

		before.add(new Book("Fairy Tales", 1997, 10));
		before.add(new Book("Java for beginners", 1995, 15));
		before.add(new Book("Mathematics", 1990, 12));
		before.add(new Book("English Dictionary", 2018, 55));

		File file = new File("Book.txt");

		// Создание файла
		file.createNewFile();

		// Создание объекта FileWriter
		FileWriter writer = new FileWriter(file);

		// Запись содержимого в файл
		for (Book line : before) {
			writer.write(line.toString());
			writer.write(System.getProperty("line.separator"));
		}

		writer.flush(); // выводит байты из буфера
		writer.close();

		// Создание объекта FileReader
		FileReader fr = new FileReader(file);

		BufferedReader reader = new BufferedReader(fr);

		String line = null;
		ArrayList<Book> after = new ArrayList<Book>();

		while ((line = reader.readLine()) != null) {
			String[] lineParse = line.split(",");
			after.add(new Book(lineParse[0], Integer.parseInt(lineParse[1]), Double.parseDouble(lineParse[2])));
		}
		reader.close();

		for (Book lineFinish : after) {
			System.out.println(lineFinish);
		}
	}
}
