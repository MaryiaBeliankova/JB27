package by.cdp.jb27_les04.main;

import java.util.Scanner;
import java.util.Random;

public class NulevMas {
	//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов. 
	

	public static void main (String []args) {
		int n=0;
		
		n=ReadN();
		RandMas(n);
		
	}
	
	public static int ReadN () {
		int n=0;
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("Input integer amount of massiv elements ");
			
			if (sc.hasNextInt()) {
				n=sc.nextInt();
			}
			else {
				System.out.println("Invalid number. Try again ");
				sc.next();
			}
			if (n>=0) {
				break;				
			}
			else {
				System.out.println("Small number. Try again ");
				continue;
			}			
		}
		return n;	
	}
	
	public static int RandMas (int n) {
		
		int mas [];
		mas =new int [n];
		
		int mas1 [];
		mas1 = new int [n];
		
		int i=0, j=0;
		
		Random rand = new Random();
		
		System.out.println("Random massiv");
		
		for (i=0; i<n; i++) {
			mas[i]=rand.nextInt(10);
						
			if (mas[i] % 3 == 0) {
				mas[i]=0;
				
			}
			else mas[i]=rand.nextInt(30);
			
			System.out.println(mas[i]);
		}
		
		System.out.println ("New massiv");
		
		for (i=0; i<n; i++) {
			
			if (mas[i]==0) {
				mas1[j]=i;
				
				System.out.println (mas1[j]);
				j++;
				
			}			
		}
		
		return 0;
	}
}
