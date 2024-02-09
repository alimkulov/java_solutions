package by.epam.unit04.main;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		int[] mas = new int[10];
		
		Random rand = new Random();
		
		for (int i=0; i<mas.length; i++) {
			mas[i]=rand.nextInt(100);
			System.out.printf("[%3d]",mas[i]);
		}
        System.out.println();
        
        for (int i=0; i<mas.length; i++) {
        	int val=mas[i];
        	
        	int j=i-1;
        	
        	for (; j>=0; j--) {
        		if (val<mas[j]) {
        			mas[j+1]=mas[j];
        		} else {
        			break;
        		}    		
        	}
          mas[j+1]=val;	
        }
        
        for(int i=0; i<mas.length; i++) {
        	System.out.printf("{%3d}",mas[i]);        	
        }
	}
}
