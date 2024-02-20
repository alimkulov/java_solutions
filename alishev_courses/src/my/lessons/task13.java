package my.lessons;

public class task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix= { {1,2,3}, 
				          {4,5,6,11}, 
				          {7,8,9,10,12}};
		
		System.out.println(matrix[1][2]);
		System.out.println(matrix[2][1]);
		System.out.println();
		
		for(int i=0; i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
	       System.out.println();
		}

	}

}
