package by.epam.unit03.main;

public class Task02 {
	public static void main(String[] args) {
		
		int x=1;
		int sum=0;
		
		while(x<100) {
	        if(x%2==1) {
	        	sum=sum+x;
	    //    System.out.println("x="+x);
	   //     System.out.println("sum="+sum);
	        }
			     
	        x++;
		}
		
		System.out.println("Res_sum="+sum);
	}

}
