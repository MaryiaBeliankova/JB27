package by.cdp.jb27_les01.main;

public class Triang {

	public static void main (String[] args) {
		double a, b; // 2 kateta
		double c=0; // gipotenyza
		double p; // perimetr
		double s; // plochad
		a=10;
		b=20;
		
		c=Math.sqrt (a*a+b*b);
		p=a+b+c;
		s=0.5*a*b;
		
		System.out.println("Площадь треугольника= "+s+" Периметр треугольника = "+p);
	}
}
