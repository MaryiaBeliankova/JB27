//Определить класс «Дробь» в виде пары m/n. Объявить массив из k дробей, ввести/вывести значения для массива дробей

package by.cdp.jb27_les06;

import java.util.Random;
import java.util.Scanner;

public class CreateFrac {

	public static void main (String [] args) {
		
		int k=0; //amount of faction
		k=ReadK();
		
		
		Random rand = new Random(); 
		
		Fraction [] f = new Fraction [k];
					
		for (int i=0; i<k; i++) {
			
				
			f[i]= new Fraction ();
						
			f[i].numer=(rand.nextInt(10)+1);
			f[i].denom=(rand.nextInt(20)+1);
						
		System.out.println("Fraction = "+f[i].numer+"/"+f[i].denom);
		}
	}	
	
	public static int ReadK () {
		int k=0;
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("Input postitive integer amount of massiv elements ");
			
			if (sc.hasNextInt()) {
				k=sc.nextInt();
			}
			else {
				System.out.println("Invalid number. Try again ");
				sc.next();
			}
			if (k>=0) {
				break;				
			}
			else {
				System.out.println("Small number. Try again ");
				continue;
			}			
		}
		return k;	
		}
			
			
	
}
