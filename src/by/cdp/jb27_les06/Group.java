package by.cdp.jb27_les06;

import java.util.Random;

public class Group {

	private int colstud = 3; // amount of students
	private int colmar = 3; // amount of marks
	public int num;
	public Student[] stud = new Student[colstud];

	public Group() {

		Random rand = new Random();
		num = (rand.nextInt(5) + 1);

		for (int i = 0; i < colstud; i++) {

			stud[i] = new Student();

			stud[i].setStud();

			stud[i].setMark(colmar);
		}
	}

	public int getStudCount() {

		return colstud;
	}

	public double getAvgGr() {

		double avg = 0;
		int sum = 0, k;

		for (int j = 0; j < colstud; j++) {

			for (int i = 0; i < colmar; i++) {

				sum += stud[j].ozen[i];
			}

		}
		avg = sum / (colstud * colmar);

		return avg;
	}

	public int getGoodStud() {

		double avgst;
		double sum = 0;
		int gs = 0;

		for (int j = 0; j < colstud; j++) {
			sum = 0;
			for (int i = 0; i < colmar; i++) {

				sum += stud[j].ozen[i];
			}
			avgst = sum / colmar;

			if (avgst >= 3.5) {
				gs++;
			}
		}

		return gs;
	}

	public int getBadStud() {

		int bs = 0;

		for (int j = 0; j < colstud; j++) {
			
			for (int i = 0; i < colmar; i++) {

				if (stud[j].ozen[i] == 2) {
					bs++;
					break;
				}
			}
		}
		return bs;
	}
}
