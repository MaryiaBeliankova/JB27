package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class Formula {
	//Вычислить значение функции: 
	//F(x)= 9, если х<=-3
	//F(x)=1 /(x*x+1), if x>3
	
public static void main (String []args) {
	double x=0, res=0;
	x=ReadX();
	res=CalcX(x);
}
	
public static int ReadX () {
	int x=0;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Input an integer number ");
	
	while (!sc.hasNextInt()) {
		sc.next();
		System.out.print("Invalid number. Try again ");
	}
	x=sc.nextInt();
	return x;
}

public static double CalcX (double x) {
	
	double y;
	
	if (x<=-3) {
		y=9;
		System.out.print("Function F(x)= "+y);
	} 
	else
	
		if (x>3) {
		y=1/(x*x+1);
		System.out.print("Function F(x)= "+y);
	}
	else 
		System.out.print("Function F(x) is not defined ");
	return x;
}

}
