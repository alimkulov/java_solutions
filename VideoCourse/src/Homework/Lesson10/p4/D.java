package Homework.Lesson10.p4;

import Homework.Lesson10.p1.A;
import Homework.Lesson10.p1.p2.B;
import Homework.Lesson10.p1.p2.p3.C;
import Homework.Lesson10.p4.p5.*;

import static Homework.Lesson10.p1.p2.B.*;

public class D {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.str1);
		
		B b =new B();
		b.showB();
		
		C c=new C();
		c.showC();
		
		E e=new E();
		
		System.out.println(e.xyz);
		
		System.out.println(str2);
	}
}
