package my.training.simplestapp.main.lesson02;

public class task09 {

	public static void main(String[] args) {
		int x;
		double f=0;
		
		x=-4;
		
		if (x<=-3) {
			f=9;
		} else if (x>3) {
			f= (int)(1 / ( Math.pow(x,2) +1 ) );
		}
		
	  System.out.println("Fx="+f);
	}
}
