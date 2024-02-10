package it.ihu.unit05.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {

      int[] mas=new int[3];
      Random rand = new Random();
      
      for (int i=0; i<mas.length; i++) {
    	  mas[i]=rand.nextInt(100);
    	  System.out.printf("[%3d]", mas[i]);
      }
      System.out.println();
      
      triple_calc(mas); 

	}
	
	public static int triple_min(int[] mas) {
		int min;
	  
	     min=mas[0];
	     
	     for(int i=0;i<mas.length;i++) {
	    	if(mas[i]<min) {
	    		min=mas[i];
	    	} 
	     }
	     System.out.println("min="+min);
	    return min;
	}
	
	public static int triple_max(int[] mas) {
		int max;
		
	     max=mas[0];
	     
	     for(int i=0;i<mas.length;i++) {
	    	if(mas[i]>max) {
	    		max=mas[i];
	    	} 
	     }
	     System.out.println("max="+max);
	    return max;
	}
	
	public static void triple_calc(int[] mas) {
		int sum;
		
		sum=triple_max(mas)+triple_min(mas);
		
		System.out.println("Sum="+sum);
		
	}
	

}
