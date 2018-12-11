package by.cdp.jb27_les01.main;

public class Cosinus {
	public static void main (String[] args) {
		double x, y;
		double res;
		double form;
		
		x=10.2;
		y=20.3;
		
		res=Math.cos(x)-x/3;
		if (res!=0)
				{
			form=x*Math.log(x)+y/res;
			System.out.println("Выражение = "+form);
				}
			else 
				{
				System.out.println("Делить на ноль нельзя! Знаменатель = "+res);
								}
		}
	}


