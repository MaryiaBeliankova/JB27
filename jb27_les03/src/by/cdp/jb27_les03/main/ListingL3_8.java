package by.cdp.jb27_les03.main;
import java.util.Scanner;

public class ListingL3_8 { 

	// —оставить линейную программу, печатающую значение true, если указанное высказывание €вл€етс€ истинным, 
	//и false Ч в противном случае: в заданном натуральном трехзначном числе N имеетс€ четна€ цифра. 
	
	public static void main(String[] args) {
		int n, z;
		
		n=ReadN();
		z=CalcN(n);
	}
			  
	public static int ReadN () {
		Scanner sc = new Scanner (System.in);
		
		int x=0;
		
		System.out.print("Input three-digit number ");
				while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Invalid number. Try again. ");
			
			x= sc.nextInt();						
		
				if (100>=x && x<=999) {
					System.out.print("Invalid number. Try again. ");}
				else 
					
					x= sc.nextInt();	
					
	}	
				return x;
}
	
	public static int CalcN (int x) {
		int y;
		y=x % 10;
		if (y % 2 == 0) {
			System.out.print("There is an even numeral" );
		}
		else System.out.print("There is no an even numberal ");
				return y; 
	}	
}
	

