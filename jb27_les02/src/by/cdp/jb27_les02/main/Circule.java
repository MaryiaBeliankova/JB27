package by.cdp.jb27_les02.main;

import java.util.Scanner;

public class Circule {
	public static void main (String []args) {
		
		double r=0;
		double d, s;
		double pi=3.14151926;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("������� ������ ����� ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� ������ ����� ");
		}
		r=sc.nextDouble();
					
		/*if (sc.hasNextDouble()) {
			r=sc.nextDouble();
		}*/
		
		d=pi*2*r;
		s=pi*r*r;
		
		System.out.println("����� ���������� ��������� ������� = "+d+"\n������� ����� ��������� ������� = "+s);
	}

}

