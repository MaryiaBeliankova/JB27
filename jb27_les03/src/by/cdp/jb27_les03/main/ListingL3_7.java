package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class ListingL3_7 {
	public static void main (String []args)
	{
		//—оставить программу, котора€ по заданным году и номеру мес€ца т определ€ет количество дней в этом мес€це. 
		
		int god, mes, den;
		
		god=ReadYear();
		//System.out.println("Year is "+god);
		
		mes = ReadMon();
		//System.out.println("Month is "+mes);
		
		den=FindDay(god, mes);
				
	}

	public static int ReadYear () {
		Scanner sc = new Scanner (System.in);
		
		int x=0;
			
		while (true) {
			
			System.out.println("Input a year ");
			
			if (!sc.hasNextInt()){
				System.out.println("Invalid number. Try again ");
				sc.next();
				continue;
			}
			else x=sc.nextInt();
			
			if (x<=0 | x>9999) {
				System.out.println("Invalid year. Try again ");
				sc.next();
				continue;
			}
					 break;
		}
		
		return x;
	}
		
	public static int ReadMon () { //input number of a month
	
		Scanner sc = new Scanner (System.in);
		
		int x=0;
		
		
		while (true) { 
			
			System.out.println("Input a month ");
		
			if (!sc.hasNextInt()) {
				System.out.println ("Invalid number. Try again ");
				sc.next();
				continue;
			}
			else x=sc.nextInt();
			
			if (x<=0 | x>=13) {
				System.out.println("Invalid month. Try again ");
				sc.next();
				continue;
			}
			
			break;
		}
		return x;				
	}
	
	public static int FindDay (int y, int m) {
		
		int d=0;
		
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10: 
		case 12:
			d=31;
			break;
		case 2:
			if (y % 4 == 0) { //define leap year
				d=29;
			}
				else {
					d=28;
				}
				break;		
		case 4:
		case 6:
		case 9:
		case 11:
			d=30;
			break;
			}
				
			
		System.out.print("For the month "+m+ " and the year " +y+ " amount of days are "+d);
		return y;

	}
	
	}
