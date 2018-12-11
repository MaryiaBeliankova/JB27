package by.cdp.jb27_les01.main;

public class Gipotenuza {
	public static void main (String [] args) {
		double a, b; //katet
		double c=0; //gipotenuza
		
		double s; //plochad triangle
		
		a=3;
		b=4;
		
		c=Math.sqrt(a*a+b*b);
		s=0.5*a*b;
		
		System.out.println("Гипотенуза = "+c+" Площадь треугольника= "+s);
			
	}

}
