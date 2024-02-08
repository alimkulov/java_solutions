package by.epam.unit03.main;

public class Task03 {
	public static void main(String[] args) {
		
		int x=1;
		int sum=1;
		long res=1;
		
		do {
			x++;
			sum=sum+x;
			res=res*sum;
			System.out.println("x="+x);
			System.out.println("sum="+sum);
			System.out.println("res="+res);
			
		} while(x<10);
		
			System.out.println("res="+res);		
	}

}
