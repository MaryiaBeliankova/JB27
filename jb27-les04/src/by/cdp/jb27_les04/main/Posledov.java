package by.cdp.jb27_les04.main;

import java.util.Scanner;
import java.util.Random;

public class Posledov {
	
	public static void main (String [] args) {
		
		int n;
		int [] mas;
		
		n=ReadN();
		RandMas(n);
		}

	public static int ReadN () {
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		while (true) {
			
			System.out.println("Input size of the massiv ");
			if (sc.hasNextInt()) {
				n=sc.nextInt();
			}
			else {
				System.out.println ("Invalid number. Try again ");
				sc.next();
				continue;
			}
			if (n>=0) {
				break;				
			}
			else {
				System.out.println ("Small number. Try again ");
				continue;
			}			
		}
		return n;
	}
	
	public static int RandMas (int n) {
		Random rand = new Random ();
		
		int [] mas;
		mas = new int [n];
		int j;
				
		for (j=0; j<n; j++) {
			mas[j]=rand.nextInt(300);
				System.out.println(mas[j]);	
		}
		
		for (j=0; j<mas.length; j++) {
			if (mas[j]>mas[j+1]) {
				return mas[j];
			}
			else System.out.println("Massiv is not increasing ");
		}
		
		return 0;
		}	
		
	}
