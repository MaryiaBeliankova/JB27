package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class MyMethod {
	public static void main (String [] args) {
		
		double x=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input x");
		if (sc.hasNextDouble()) {
			x=sc.nextDouble();
		}
		
		calc(x);
		//System.out.print("Result = ");
	}	
		public static void calc(double x){
			
			double res;
			
			if (x >= 3) {
				res = -x * x + 3 * x + 9;   
				} 
			else {
				res = 1 / (Math.pow(x, 3) - 6);
				} 
			 
			  System.out.println("Result= " +res);			
		}
		
		
	}

