package my.lessons;

public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Human human=new Human();
         System.out.println("Имя="+human.getName()+" возраст="+human.getAge());
	}
    
}

class Human {
	
	private String name;
	private int age;
	
	public Human() {
		this.name="Имя пол умолчанию";
		this.age=0;
	}
	
	public Human(String _name) {
		this.name=_name;
		this.age=0;
	}
	
	public Human(String _name, int _age) {
		this.name=_name;
		this.age=_age;
	}
	
	public void setAge(int _age) {
		age=_age;
	}
	
	public void setName(String _name) {
		name=_name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}