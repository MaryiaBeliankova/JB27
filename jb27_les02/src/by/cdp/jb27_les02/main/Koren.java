package by.cdp.jb27_les02.main;

import java.util.Scanner;

public class Koren {
	public static void main (System []args) {
		double b=0, a=0, c=0;
		double z, res;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("������� � ");
		if (sc.hasNextDouble()) {
			a=sc.nextDouble();
		}
		
		if (a!=0) {						
		System.out.print("������� b ");
		if (sc.hasNextDouble()) {
			b=sc.nextDouble();
		}
		
		System.out.print("������� � ");
		if (sc.hasNextDouble()) {
			c=sc.nextDouble();
		}
			res=Math.sqrt(b*b+4*a*c);
			z=(b+res)/2*a-(a*a*a*c+b);
		
			System.out.println("������� = "+z);
			
		} else
			System.out.println("����������� ����� ����");	
		z=Double.NaN;
		
	}
	}