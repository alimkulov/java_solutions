package it.ihu.unit05.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
	   int[] mas=new int[2];
	   
	   Random rand=new Random();
	   
	   for (int i=0; i<mas.length;i++) {
		   mas[i]=rand.nextInt(150);
		   System.out.printf("[%4d]",mas[i]);
		   
	   } System.out.println();
	   
	   get_max_numb(mas);
	}
	
	public static void get_max_numb(int[] mas) {
		String str1=new String();
		String str2=new String();
		
		str1=String.valueOf(mas[0]);
		str2=String.valueOf(mas[1]);
		
		int max;
		max=str1.length();
		
		if(str2.length()>max) {
			max=str2.length();
		}
		System.out.println("max_number="+max);
		
	}

}
