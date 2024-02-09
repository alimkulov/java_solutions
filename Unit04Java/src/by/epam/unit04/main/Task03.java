package by.epam.unit04.main;

import java.util.Random;

public class Task03 {
	
	public static void main(String[] args) {
		
		double[] mas=new double[] {-1.0, 0.0, 2.3, -4.5, -9.0, 5.1, 0,-5, 2.4, 0, -8.1 };
		
		int p=0,n=0,z=0;
		
		//Random rand=new Random();
		
	   for(int i=0; i<mas.length; i++) {
		  System.out.printf("[%4.2f]",mas[i]);		
		  
		  if (mas[i]<0) {
			  n++;
		  } else if (mas[i]>0) {
			  p++;
		  } else { z++; }
	   }	

	   System.out.println("\nnum of positive="+p);
	   System.out.println("num of negative="+n);
	   System.out.println("num of zero="+z);
	   
		
	}

}
