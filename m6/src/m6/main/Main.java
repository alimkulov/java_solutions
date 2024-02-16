package m6.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Message<Integer,String> ref1=new Message<Integer,String>(1,"One");
		
		Message<String,String> ref2=new Message<String,String> ("1","One");
		Message<Integer,String> ref3=new Message<Integer,String>(3,"Three");
		
		ref1=ref3;
		
		MyIntf<String,String> ref4=new Message<String,String>("1","One");

	}

}
