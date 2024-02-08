package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {

  public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		String x;
		String y;
		System.out.print("> ");
		
		while(!sc.hasNext()) {
			sc.nextLine();
			System.out.print("> ");
		}
	
		x=sc.next();
		
		System.out.println("Roman = "+x);
		
		switch(x) {
		case "I": y="1"; 
		break;
		case "II": y="2"; 
		break;
		case "III": y="3";
		break;
		case "IV": y="4";
		break;
		case "V": y="5";
		break;
		case "VI": y="6";
		break;
		case "VII": y="7";
		break;
		case "VIII": y="8";
		break;
		case "IX": y="9";
		break;
		case "X": y="10";
		break;		
		default: y="Unknown";
		break;
		}
	
		System.out.println("Arab = "+y);
		
  }
	
	
	
	
}
