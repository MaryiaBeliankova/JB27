package by.cdp.jb27_les02.main;

import java.util.Scanner;

public class SumMul {
	
	public static void main (System []args) {
		double x=0, y=0;
		double sum, mul;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите х ");
		
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите х");
		}
		x=sc.nextDouble();
		
		
		System.out.print("Введите у ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите у");
		}
		y=sc.nextDouble();
		
		sum=x+y;
		mul=x*y;
		
		System.out.println("Сумма чисел = "+sum+" Произведение чисел = "+mul);
	}

}