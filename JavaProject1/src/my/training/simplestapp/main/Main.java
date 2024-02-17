package my.training.simplestapp.main;

public class Main {
	public static void main(String[] args) {
	
   // 2 и 3		
	  String name="John";
	  String addr="USA";
	  String phone="777";
	  
	  System.out.println("FIO:"+name);
	  System.out.println("address:"+addr);
	  System.out.println("phone:"+phone);
	  
  //4
	  int a = 2; // катет
	  int b = 3; // катет
	  double c; // гипотенуза
	  float s; // площадь 
	  
	  
	  c= Math.sqrt(Math.pow(2,2)+Math.pow(3,2));
	  s=a*b/2;
	  
	  System.out.println("гипотенуза="+c);
      System.out.println("площадь="+s);
      
  // 5
     int f=1,g=2,h=3,j=4;
     
     int res;
     res=f+g+h+j;
     System.out.println("сумма слогаемых="+res);
  //6
     
     double res2;
     int a2=2;
     int b2=4;
     int c2=5;
     
     res2= Math.pow(a2,2)-Math.pow((b2-c2),2);
     System.out.println("результат6="+res2);
    		 
     
   //7
     //a
     double b3=6;
     double a3=-2.5;
     double c3=0.5;
     
     double res3;
     double t1,t2;
     
     t1=Math.pow(b3,2)+4*a3*c3;
     t2=2*a3;
     if (t1<0) {
    	 System.out.println("отрицательное значение под корнем");
    	 res3=Double.NaN;
     } else if (t2==0) {
    	System.out.println("Знаменатель равен нулю");
    	res3=Double.NaN;
     }
     else {
       res3=(b3+t1)/t2 - Math.pow(a3,3) * c3 + b3;
     }
 	System.out.println("результат7.1="+res3); 
     //b   
      double t3;
      double d3=2.0;
      t3=c3*d3;
      
      if (t3!=0 && c3!=0 && d3!=0) {
    	  res3=(a3/c3) * (b3/d3) - (a3*b3 -c3)/t3;
      } else {
    	  System.out.println("Знаменатель равен нулю");
    	  res3=Double.NaN;
      }
	  System.out.println("результат7.2="+res3);
	}

}
