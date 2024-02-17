package my.training.simplestapp.main.lesson02;

public class task04 {
	
	public static void main(String[] args) {
		
		float x1,x2,y1,y2;
		double temp,AB;
		
		x1=1;
		y1=-1;
		x2=-2;
		y2=4;
		
		temp = Math.pow((x1-x2),2)+ Math.pow((y1-y2),2);
		AB= Math.sqrt(temp);
		
		System.out.println("расстояние равен: "+AB);
	}

}
