package by.epam.unit04.main;

import java.util.Random;

public class Task02 {
	
	public static void main(String[] args) {
		int[] mas=new int[10];
		int max, min;
		Random rand=new Random();
		for (int i=0;i<mas.length; i++) {
			mas[i]=rand.nextInt(100);
			
			System.out.printf("[%3d]", mas[i]);	
		}
		
		System.out.println();
		
		max=mas[0];
		min=mas[0];
		
		for (int i=0; i<mas.length; i++) {
			if (max<mas[i]) {
				max=mas[i];
			}
			
			if (min>mas[i]) {
				min=mas[i];
			}
		}
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		System.out.println("diff="+(max-min));
	}

}
