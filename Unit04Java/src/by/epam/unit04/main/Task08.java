package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task08 {
      
	public static void main(String[] args) {
	  
		int n=10, m=9, k=0, p=0;
		int[][] mas=new int[n][m];
	   
	   Random  rand =new Random();
	   
	   for (int i=0; i<mas.length; i++) {
		  for (int j=0; j<mas[i].length; j++) {
			  mas[i][j]=rand.nextInt(100);
			  System.out.printf("[%3d]",mas[i][j]);
		  } 
		  System.out.println();
	   }
	   
	  Scanner sc=new Scanner(System.in);
	  
		System.out.print("k> ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("k> ");			
		}
        k=sc.nextInt();
        
		System.out.print("p> ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("p> ");			
		}
		p=sc.nextInt();
		
		if(k>=0 && k<=n && p>=0 && p<=m) {
				for (int i=0; i<mas[k].length; i++) {
					System.out.printf("[%3d]",mas[k][i]);
				}
				System.out.println("\n");
				
				for (int i=0; i<mas.length; i++) {
					System.out.printf("[%3d]",mas[i][p]);
					System.out.println();
				}
		} else {
			System.out.println("Wrong input parameters");
		}

	}

}
