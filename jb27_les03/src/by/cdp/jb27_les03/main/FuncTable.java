package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class FuncTable {
	//—оставить программу дл€ вычислени€ значений функции  F(x) на отрезке [а, b] с шагом h. 
	//–езультат представить в виде таблицы, первый столбец которой Ц значени€  аргумента, второй - соответствующие значени€ функции: 
	// F(x)=2tg (x/2)+1

	public static void main (String [] args) {
		double a=0, b=0, h=0, x=0, Fx;
		
		a=ReadA();
		b=ReadB();
		h=ReadH();
		System.out.println ("Step "+h);
		
		Fx=CalcFx(a,b,h);
		
	}
	public static double ReadA () {
		double x;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Input A - begin of a section ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Invalid number. Try again ");
		}
		x=sc.nextDouble();
		return x;
	}
	
	public static double ReadB () {
		Scanner sc = new Scanner (System.in);
		
		double x;
		System.out.print ("Input B -  end of a section ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Ivalid number. Try again ");
		}
		x=sc.nextDouble();
		return x;
	}
	
	public static double ReadH () {
		Scanner sc = new Scanner (System.in);
		double x;
		
		//System.out.print("Input step between A and B ");
		
		while (true) {
			
			System.out.print("Input step between A and B ");
			
			if (!sc.hasNextDouble()) {
				System.out.print("Invalid number. Try again ");
				sc.nextDouble();
				continue;
			}
			else x=sc.nextDouble();
						
			if (x<=0) {
				System.out.print("Small number. Try again ");
				sc.nextDouble();
				continue;
		}
		break;		
		}
		return x;
	}
	
	public static double CalcFx (double a, double b, double h) {
		double x,Fx;
		int i=0;
		
			
		System.out.println();
		System.out.println("X    F(x)");
		
		
		while (true) {
			x=a+i*h;
			
			if (b<a) {
				System.out.print("Invalid section. Fx is not defined");
				break;
			}
			
			if (x>b) {
				break;
			}
			
			Fx=2*Math.tan(x/2)+1;
						System.out.println(x+"   "+ String.format("%.2f", Fx) );
			i++;
			//break;					
		}
		return 0;
		
			
	}
}

