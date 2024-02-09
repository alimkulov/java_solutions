package by.epam.unit04.main;

public class Task10 {

	public static void main(String[] args) {
		int n=12;
		   
		   int[][]  mas =new int[n][n];
		   
		   for (int i=0; i<mas.length; i++) {
			   for(int j=0; j<mas[i].length; j++) {
				   if(j==0 || j==mas[i].length-1 || i==0 || i==mas.length-1) {
					   mas[i][j]=1;
				   }
				   
			   }
		   }

		   for(int i=0; i<mas.length; i++) {
			   for(int j=0;j<mas[i].length; j++) {
				   System.out.printf("[%3d]",mas[i][j]);
			   }
			   System.out.println();
		   }

	}

}
