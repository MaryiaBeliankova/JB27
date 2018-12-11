package by.cdp.jb27_les03.main;

import java.util.Scanner;  

public class ListingL3_5 {
	
	public static void main (String []args) {
			
		int x, y;  //Ввести n строк с консоли, найти самую длинную и самую короткую строки. Вывести найденные строки и их длины.
		
		x=ReadN();
		y=CalcRows(x);
	}
		public static int ReadN () {
						
			Scanner sc= new Scanner(System.in); 
			int n=0;
			
			System.out.print("Input amount of rows ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Input amount of rows ");
			}
			n=sc.nextInt();
			return n;
		}	
	
	
		public static int CalcRows (int n) {
			
			Scanner sc = new Scanner (System.in);
			String max = "", min = "", str = "";			
			
		for (int i = 0; i < n; i++) {
		
			System.out.print("Input a line ");    
			
			if (sc.hasNextLine()) {
				str = sc.nextLine();
				if (i == 0) {
					min = str;     
					}
				if (str.length() > max.length()) {
					max = str;     
					} 
				else if (str.length() < min.length()) {
					min = str;     
					}    
				}			
						}   
		
		System.out.println("Max string = " + max + " Length=" + max.length());
		System.out.println("Min string = " + min + " Length=" + min.length());
		return n;
	}	
}

			
		


