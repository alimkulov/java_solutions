package kz.mylab.lesson23;

public class Test2 {
}


class Employee {
    double salary =100;
    String name="Kolya";
    int age;
    int experience;
    void eat() {
        System.out.println("Eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}

class Doctor extends Employee {
    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee{
    int numberPupils;
    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee{
    String carName;
    void vodit() {
        System.out.println("Vodit");
    }
}