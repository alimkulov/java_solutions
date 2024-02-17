package my.training.simplestapp.main.lesson02;

public class task02 {
   public static void main(String[] args) {
	   float x;
	   float y;
	   float z;
	   
	   x=3;
	   y=4;
	   System.out.println("start x="+x+"; y="+y+";");
	   if (x<y) {
		   z=y;
		   y=x;
		   x=z;
		   
	   }
	   
	   System.out.println("after x="+x+"; y="+y+";");
		  
	   
	   
   }
}
