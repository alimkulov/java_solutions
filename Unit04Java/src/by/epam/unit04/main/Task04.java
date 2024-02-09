package by.epam.unit04.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		int[] mas=new int[20];
		
		Random rand=new Random();
	    
		boolean flag=false;
		int temp;
		
		for(int i=0; i<mas.length; i++) {
			mas[i]=rand.nextInt(100);
			System.out.printf("[%3d]",mas[i]);
		}
		
		while(!flag) {
			flag=true;
			
			for(int i=0;i<mas.length-1;i++) {
				
				if(mas[i+1]<mas[i]) {
			     temp=mas[i];
				 mas[i]=mas[i+1];
				 mas[i+1]=temp;
				 flag=false;
				}				
			}						
		}
		
		System.out.println();
		for (int i=mas.length-1; i>=0 ; i--) {
			System.out.printf("[%3d]",mas[i]);
		}
		
	}
}
