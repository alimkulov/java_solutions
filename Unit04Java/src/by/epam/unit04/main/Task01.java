package by.epam.unit04.main;

import java.util.Random;

public class Task01 {
	
	public static void main(String[] args) {
		
		int count=0;
		int[] mas=new int[10]; //{1,3,5,7}; //for test
		int[] chet;
		
		Random rand = new Random();
		
		for (int i=0; i<mas.length; i++) {
			
			mas[i]= rand.nextInt(100);
			
			System.out.printf("[%3d]", mas[i]);
		}
         System.out.println();
		
		for (int i=0; i<mas.length; i++) {
			if(mas[i]%2==0){
				count++;
			}
		}
		
		chet=new int[count];
		
		if(count==0) {
			System.out.println("Array doesnt contain even numbers");
		} else {
				for(int i=0, j=0; i<mas.length; i++) {
					if(mas[i]%2==0) {
						chet[j++]=mas[i];
					}			
				}
				
		  for(int j=0; j<chet.length; j++) {
			  System.out.printf("[%3d]",chet[j]);
		  }
		 
		}
		
		
	}

}
