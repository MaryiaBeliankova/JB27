package by.cdp.jb27_les02.main;

import java.util.Scanner;

public class SumMul {
	
	public static void main (System []args) {
		double x=0, y=0;
		double sum, mul;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������� � ");
		
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� �");
		}
		x=sc.nextDouble();
		
		
		System.out.print("������� � ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� �");
		}
		y=sc.nextDouble();
		
		sum=x+y;
		mul=x*y;
		
		System.out.println("����� ����� = "+sum+" ������������ ����� = "+mul);
	}

}