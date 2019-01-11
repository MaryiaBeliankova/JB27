//Оценки, полученные студентами в сессию, являются атрибутами класса Student. 
//Определить: а) средний балл учебной группы (использовать класс Group); 
//б) средний балл каждого студента; 
//в) число отличников; 
//г) количество студентов, имеющих "2". 

package by.cdp.jb27_les06;

import java.util.Random;

public class CalcMark {

	public static void main(String[] args) {
		int colgr = 2;
		String str = " ", str2 = " ";
		double avgst;

		Random rand = new Random();
		Group[] gr = new Group[colgr];

		// create array of groups
		for (int i = 0; i < colgr; i++) {

			gr[i] = new Group();

			gr[i].num = (rand.nextInt(5) + 1);

			System.out.println("");
			System.out.println("Group name: " + gr[i].num);

			System.out.println("Average mark for group: " + gr[i].num + " is " + gr[i].getAvgGr());
			System.out.println("Amount of good students for group: " + gr[i].num + " is " + gr[i].getGoodStud());
			System.out.println("Amount of bad students for group: " + gr[i].num + " is " + gr[i].getBadStud());
			System.out.println("");

			// create array of students for a group
			for (int j = 0; j < gr[i].getStudCount(); j++) {

				str = gr[i].num + " " + " " + gr[i].stud[j].name + " ";
				str2 = " ";

				// display array of marks for a student
				for (int k = 0; k < gr[i].stud[j].getMarkCol(); k++) {

					str2 = str2 + " " + gr[i].stud[j].ozen[k];

				}
				avgst = gr[i].stud[j].getAvgStud();

				System.out.println(str + str2 + "  Avg " + String.format("%.2f", avgst));
			}

		}

		// System.out.println("Amount of bad students is "+gr[i].stud[j].name);

	}
}
