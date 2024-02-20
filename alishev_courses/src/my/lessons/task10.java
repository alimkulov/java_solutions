package my.lessons;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("vvedit vozrast:");
		int age=sc.nextInt();
		switch(age) {
		case 0:
			System.out.println("vam 0");
			break;
		case 7:
			System.out.println("vam 7");
			break;
		case 18:
			System.out.println("vam 18");
			break;
	    default:
	    	System.out.println("Vy nichego ne vveli");
		}
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("vvedite vozrast propisu");
		String ageStr=sc2.nextLine();
		switch(ageStr) {
		case "nol":
			System.out.println("Vy vveli nol");
		case "sem":
		}

	}

}
