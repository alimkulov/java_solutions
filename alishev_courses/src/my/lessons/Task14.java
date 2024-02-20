package my.lessons;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person person1=new Person();
       //person1.name="John";
       person1.setName("John");
       //person1.age=20;
       person1.setAge(20);
       person1.sayHello();
       person1.speak();
       Person person2=new Person();
       //person2.name="Jerry";
       person2.setName("Jerry");
       //person2.age=30;
       person2.setAge(30);
       person2.speak();
	}

}



class Person{
	String name;
	int age;
	
	void setAge(int _age) {
		age=_age;
	}
	
	void setName(String _name) {
		name=_name;
	}
	
	void speak() {
		System.out.println("Name="+name+" age="+age);
	}
	
	void sayHello() {
		System.out.println("Hello!");
	}
}