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

/*
 * public static void main2(String[] args) {
 * 
 * int gs = 0, bs=0, sum; double sb, ab;
 * 
 * String str = "";
 * 
 * Group g1 = new Group(); g1.num = 1; //g1.ball[j]=s[i].ozen[k];
 * 
 * Group g2 = new Group(); g2.num = 2;
 * 
 * int length = 8; String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
 * "abcdefghijklmnopqrstuvwxyz";
 * 
 * Random rand = new Random();
 * 
 * Student[] s = new Student[25];
 * 
 * for (int i = 0; i < 25; i++) {
 * 
 * s[i] = new Student();
 * 
 * s[i].name = new Random().ints(length, 0, chars.length()).mapToObj(n -> "" +
 * chars.charAt(n)) .collect(Collectors.joining());
 * 
 * // s[i].group = 1;
 * 
 * // str = s[i].group + " " + s[i].name + " ";
 * 
 * sum = 0;
 * 
 * for (int k = 0; k < 3; k++) { s[i].ozen[k] = (rand.nextInt(5) + 1);
 * 
 * if (s[i].ozen[k]==2) { bs++; }
 * 
 * sum += s[i].ozen[k];
 * 
 * str = str + s[i].ozen[k] + " "; } sb = sum / 3;
 * 
 * if (sb >= 4.0) { gs++; }
 * 
 * str = str + " " + sb;
 * 
 * System.out.println(str + String.format("%.0f", sb)); }
 * 
 * System.out.println("Amount of good students is "+gs);
 * System.out.println("Amount of students with 2 is "+bs);
 * //System.out.println("Average mark of all students is "+ab);
 * 
 * }}
 * 
 * 
 * /* }
 * 
 * for (int j=0; j<25; j++) { s[j]=new Student ();
 * 
 * s[j].group=2; s[j].name= new String (array, Charset.forName("UTF-8"));
 * s[j].mark = (rand.nextInt(5)+1);
 * 
 * System.out.println (s[j].group+" "+s[j].name+" "+s[j].mark); }
 */
// }*/
