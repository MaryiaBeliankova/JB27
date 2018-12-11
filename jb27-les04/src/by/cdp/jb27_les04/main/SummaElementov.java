package by.cdp.jb27_les04.main;

import java.util.Scanner;
import java.util.Random;

public class SummaElementov {
	//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K

	public static void main (String [] args) {
		int i=0, k=0;
		int [] mas; 
		
		mas = new int [i];
		
		k=ReadK();
		i=ReadMasI();
		ReadMas(i, k);
		
	}
	
	public static int ReadK () {
		Scanner sc = new Scanner (System.in);
		
		int k;
		
		while (true) {
			System.out.println("Input integer K ");
			
			if (sc.hasNextInt()) {
				k=sc.nextInt();
				//continue;
			}
			else {
				System.out.println("Invalid number. Try again ");
				sc.next();
				continue;
			}
						
			if (k>=0) {
				break;
			}
			
			else {				
				System.out.println("K is too small. Try again ");				
				continue;
			}
		} 
		return k;

			}
	
	public static int ReadMasI () {
		Scanner sc = new Scanner (System.in);
		
		int i;
		
		while (true) {
			System.out.println("Input amount of massiv elements ");
			if (sc.hasNextInt()) {
				i=sc.nextInt();
					}
			else {
				System.out.println("Invalid number. Try again ");
				sc.next();
				continue;
			}
			
			
			if (i>=0) {
				break;
			}
			
			else {
				System.out.println("Small number. Try again ");
				continue;
			}				
		}
		return i;
	}
	
	/*public static void ReadMas (int i, int k) {
		Random rand = new Random ();
		
		int sum=0;
		int [] mas;
		mas = new int [i];
		int j;
				
		for (j=0; j<i; j++) {
			mas[j]=rand.nextInt(300);
				System.out.println(mas[j]);
			
				if (mas[j] % k == 0) {
					sum=sum + mas[j];
				}
						
	}
		System.out.println ("Summa elementov ="+sum);
	}*/

	public static int ReadMas (int i, int k) {
		int sum=0, j;
		int [] mas;
		mas= new int [i];
					
		for (j=0; j<i; j++) {
			mas[j]=j+1;
			
			System.out.println(mas[j]);
			
			if (mas[j] % k == 0) {
				sum=sum + mas[j];
			}			
		}
		System.out.println ("Summa elementov ="+sum);
		return 0;
	}
}
