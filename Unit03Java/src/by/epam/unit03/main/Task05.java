package by.epam.unit03.main;

import java.util.Scanner;

public class Task05 {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		double a,b,h;
		double y;

		System.out.print("a> ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("a> ");			
		}
		a=sc.nextDouble();
		
		System.out.print("b> ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("b> ");			
		}
		b=sc.nextDouble();
		
		System.out.print("h> ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("h> ");			
		}
		h=sc.nextDouble();
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n","x","y");
		System.out.println("---------------------------------");
		
		for(double x=a;x<=b;x=x+h) {
			
			y=2*Math.tan(x/2) + 1;
			
			 System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n",x,y);
			
		}
		
		
	}

}
