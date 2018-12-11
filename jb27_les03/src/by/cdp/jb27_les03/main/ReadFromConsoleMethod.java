package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class ReadFromConsoleMethod {
	
	public static void main (String []args) {
		
		double x=0, y=0;
	
	x=ReadConsole();
	y=Calc(x);
	Print (x,y);
	}
	
	public static double ReadConsole() {
	
		Scanner sc= new Scanner(System.in);
		double x=0;
		
		System.out.print ("Input x ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Input x ");
		}
		x=sc.nextDouble();
		return x;
	}

	public static double Calc(double x) {
		double res;
		
		if (x >= 3) { 			 
			   res = -x * x + 3 * x + 9;   
			   } 
		else {
			res = 1 / (Math.pow(x, 3) - 6);   
			}      
		return res;  
	}

	public static void Print(double x, double y) {
		System.out.println ("X="+x+" Y= "+y);		
	}
}
