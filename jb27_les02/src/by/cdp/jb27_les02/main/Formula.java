package by.cdp.jb27_les02.main;

import java.util.Scanner;

public class Formula {
	public static void main (String []arg) {
		double x=0, y=0, z;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("������� x ");
		if (sc.hasNextDouble()) {
			x=sc.nextDouble();
		}
		
		System.out.print("������� y ");
		if (sc.hasNextDouble()) {
			y=sc.nextDouble();		
		}
		
		double res;
		z=Math.cos(x)-x/3;
		if (z!=0) {
			res=x*Math.log(x)+(y/z);
			System.out.println("�������� ��������� = "+res);
		}
		else {
			System.out.println("����������� ����� ���� "+z);
		}
			
	}

}