package by.epam.unit04.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
        int[][] mas=new int[4][4];
 
        Random rand=new Random();
        
        for (int i=0; i<mas.length; i++) {
        	for(int j=0;j<mas[i].length;j++) {
        		mas[i][j]=rand.nextInt(100);
        	   
        		System.out.printf("[%3d]",mas[i][j]);
        	}
        	System.out.println();
        }
        
        System.out.println("---------------------");
        for (int i=0;i<mas.length;i++) {
            System.out.println(mas[i][i]);       	
        }
          
        System.out.println("---------------------");
        for (int i=mas.length-1,j=0;i>=0;i--) {
            	System.out.println(mas[i][j]);
            	j++;
        }
	}

}
