package my.lessons;

public class task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] str=new String[3];
       
       str[0]="Hello";
       str[1]="Bye";
       str[2]="Java";
       
       for(int i=0;i<str.length;i++) {
    	   System.out.println(str[i]);
       }
       System.out.println();
       
       for(String str1:str) {
    	   
    	   System.out.println(str1);
       }
       
       System.out.println();
       
       int[] numbers1= {1,2,3};
       int sum=0;
       for(int numb:numbers1) {
    	   sum=sum+numb;
       }
       System.out.println(sum);
	}

}
