package my.training.simplestapp.main.lesson02;

public class task03 {
	public static void main(String[] args) {
		
		int t=3564 ;  //input second
		
	    int hh;
	    int mm;
	    int ss;
	    
	    hh=t/3600; // hours
	    
	    mm=(t-(hh*3600) ) /60; //min
	   
	    ss= t - (hh*3600 + mm*60);//sec
	    
	    
	    System.out.println(hh+"ч "+mm+"мин "+ss+"c."); //res
	}

}
