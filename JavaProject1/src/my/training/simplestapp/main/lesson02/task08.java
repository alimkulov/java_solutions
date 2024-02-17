package my.training.simplestapp.main.lesson02;

public class task08 {
    public static void main(String[] args) {
    	
    	int x,y;
    	boolean sts;
    	
    	x=2;
    	y=0;
    	sts=false;
    	
    	if (y>=0) {
    		if (x>=-2 && x<=2 && y<=4) {
    			sts=true;
    		} 
    	} else {
    		if (x>=-4 && x<=4 && y>=-4)
    		{ sts=true;}
    	}
        
    	System.out.println("находиться точка в периметре:"+sts);
    	
    }
}
