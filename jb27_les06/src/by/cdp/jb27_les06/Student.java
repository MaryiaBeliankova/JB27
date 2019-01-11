package by.cdp.jb27_les06;

import java.util.Random;
import java.util.stream.Collectors;

public class Student {

	private int colmar = 3; // amount of marks
	public String name;
	public int[] ozen = new int[colmar];

	public String setStud() {

		int length = 8;
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";

		name = new Random().ints(length, 0, chars.length()).mapToObj(n -> "" + chars.charAt(n))
				.collect(Collectors.joining());

		return name;
	}

	public int getMarkCol() {
		return colmar;
	}

	public int setMark(int colmar) {

		Random rand = new Random();

		for (int k = 0; k < colmar; k++) {
			ozen[k] = (rand.nextInt(5) + 1);
		}

		return 0;
	}

	public double getAvgStud() {

		double sum = 0;

		for (int i = 0; i < colmar; i++) {

			sum += ozen[i];
		}

		return sum / colmar;

	}

	public int getBS() {

		int bs = 0;

		for (int i = 0; i < colmar; i++) {

			if (ozen[i] == 2) {
				bs++;
			}
		}
		return bs;
	}

	
}
