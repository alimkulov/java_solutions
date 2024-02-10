package it.ihu.unit05.main;

public class Task01 {

	public static void main(String[] args) {
		int a;
		int b;
		int res_nod;
		int res_nok;
		
		a=16;
		b=20;
		
		res_nod=nod(a,b);
		res_nok=nok(a,b);
		
		System.out.println("NOD="+res_nod);
		System.out.println("NOK="+res_nok);
		
		
	}
	
	public static int nod(int a, int b) {
		int res;
		
		while(a!=0 && b!=0) {
			if (a>b) {
				a=a%b;
			}
			else {
			    b=b%a;
			}
		} 
		
		res=a+b;
		
		return res;
	}
	
	public static int nok(int a,int b) {
		int res;
		
		res=(a*b)/nod(a,b);
		
		return res;
	}
	
}
