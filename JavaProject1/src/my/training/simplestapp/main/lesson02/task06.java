package my.training.simplestapp.main.lesson02;

public class task06 {
	public static void main(String[] args) {
		
		double m,n,r;
		
		int r1,r2;
		
		
		m=745;
		n=6;
		
		r=m/n;
		
		r1=(int)r;
        r1=r1%10;
        
        r2=(int)((r-(int)r)*10);
		
        System.out.println("число от деления m/n:"+r);
	    System.out.println("младшая целой части:"+r1);
        System.out.println("старшая часть дроби:"+r2);
	}

}
