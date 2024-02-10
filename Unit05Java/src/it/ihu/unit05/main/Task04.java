package it.ihu.unit05.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		int[] mas = new int[20];
        int k;
        int m;
        k=1;
        m=3;
		
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
			System.out.printf("[%3d]", mas[i]);
		}
		System.out.println();
		
		System.out.println("Summa of 3 sequence = "+get_sum_seq(k,m,mas));

	}

	public static int get_sum_seq(int k, int m, int[] mas) {
		int sum = 0;

		if (m < mas.length && m >= 0 && k >= 0 && (m-k)==2) {
			for (int i = k; i <= m; i++) {
				System.out.printf("[%3d]", mas[i]);
				sum = sum + mas[i];
			}
		} else {
			System.out.println("k or m out of range");
		}
		System.out.println();

		return sum;
	}

}
