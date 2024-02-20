package my.lessons;

public class task9 {
	
	public static void main(String[] args) {
		int i=0;
		while(true) {
			if (i==20) {
				break;
			}
		   System.out.println(i);
		   i++;
		}
		System.out.println("vyshli iz cycla");
		
		
		System.out.println("next lesson about continue");
		for( i=0;i<20; i++) {
			
			if(i%2==0) {
				continue;
			}
			System.out.println("eto nechetnoe chislo="+i);
		}
		
	}

}
