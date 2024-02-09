package by.epam.unit04.main;

public class Task06 {
	public static void main (String[] args) {
		int[][] mas = new int[][] { {1,2,7}, {7,-7,0} , {-10,7,1 } , {-7,0,3} } ;
		
		for (int i=0; i<mas.length; i++) {
			for (int j=0; j<mas[i].length; j++) {
				
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}
		
		int count=0;
		
		for (int i=0; i<mas.length; i++) {
			for (int j=0; j<mas[i].length; j++) {
				if (mas[i][j]==7) {
		           count++;			
				}
			}	
		}
		
		System.out.println("number of Seven="+count);
		
	}

}
