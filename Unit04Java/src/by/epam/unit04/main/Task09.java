package by.epam.unit04.main;

public class Task09 {

	public static void main(String[] args) {
	   int n=8;
	   
	   int[][]  mas =new int[n][n];
	   
	   for (int i=0, j=mas[i].length-1; i<mas.length; i++) {
		   mas[i][j--]=i+1;
	   }

	   for(int i=0; i<mas.length; i++) {
		   for(int j=0;j<mas[i].length; j++) {
			   System.out.printf("[%3d]",mas[i][j]);
		   }
		   System.out.println();
	   }
	}

}
