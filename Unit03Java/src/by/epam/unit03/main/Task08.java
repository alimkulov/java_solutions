package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		double x,y,z=0;
		String s;
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			System.out.print("x> ");
			if(sc.hasNext("#")) {break;}			
			while(!sc.hasNextDouble()) {
				System.out.print("x> ");
				sc.nextLine();
			}
			x=sc.nextDouble();
			
			System.out.print("y> ");
			if(sc.hasNext("#")) {break;}
			while(!sc.hasNextDouble()) {
				System.out.print("y> ");
				sc.nextLine();
			}
			y=sc.nextDouble();
			
			System.out.print("sign> ");
			if(sc.hasNext("#")) {break;}
			s=sc.next();
			switch(s) {
			case "+": z=x+y;
			 break;
			case "-": z=x-y;
			 break;
			case "*": z=x*y;
			 break;
			case "/": if(y==0) {System.out.println("Ñannot be divided by zero!"); continue; } else { z=x/y; }
			 break;
			default : System.out.println("Unknown sign!");
			break;
			}
			
			System.out.println("z="+z);
			
		} 
   
		System.out.println("Finished");
	}
}
