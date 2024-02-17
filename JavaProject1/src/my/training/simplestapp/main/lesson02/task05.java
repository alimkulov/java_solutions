package my.training.simplestapp.main.lesson02;

public class task05 {
 
	public static void main(String[] args) {
		
		float x,y;
		double res;
		
		double temp;
		
		x=1;
		y=2;
		
		temp=(Math.cos(x)-Math.sin(y));
			
		if (temp==0.0) {
			
			System.out.println("Знаменатель равень нулю!!");
			return;
		}
		
		res=( (Math.sin(x)+ Math.cos(y)) / temp ) * Math.tan(x*y);
		
		System.out.println("результат:"+res);
	}
}
