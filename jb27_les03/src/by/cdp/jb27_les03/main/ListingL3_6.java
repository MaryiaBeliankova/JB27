package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class ListingL3_6 {
	public static void main (String []args) {
		
		//Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата. 
		
		int x=0, y;
		x=ReadConsole();
		y=Calc (x);
		
	}
		public static int ReadConsole () {
			Scanner sc = new Scanner (System.in);
			int x=0;
			
			System.out.print("Input a number");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Input a number ");
		}
			x=sc.nextInt();
			return x;
	}

		public static int Calc (int x) {
			
			int z, y;
			z = x % 10;
			
			y = z * z;
			
			System.out.println("Square number of " + z + " = " + y);
			return x;
			} 
		}

