package kz.mylab.homework22.animal;

public class Animal {
    protected byte eyes;
    public Animal() {
        System.out.println("I an animal");
    }

    protected void eat() {
        System.out.println("Animal eats ");
    }

    protected void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal{
     Pet() {
         System.out.println("I am Pet");
         eyes=2;
     }
     protected String name;
     protected final byte tail=1;
     protected final byte paw=4;

     protected void run(){
         System.out.println("Pet runs");
     }

     protected void jump(){
         System.out.println("Pet jumps");
     }
}

class Dog extends Pet{
    Dog(String _name) {
        this.name=_name;
        System.out.println("I am dog and my name is:"+this.name);
    }

    Dog() {}

    protected void play() {
        System.out.println("Dog Plays");
    }
}

class Cat extends Pet{
    Cat (String _name){
        this.name=_name;
        System.out.println("I am cat and my name is:"+this.name);
    }
    Cat() {}

    protected void sleep(){
        System.out.println("Cat sleeps");
    }
}

class Test{
    public static void main(String[] args) {
        Dog d1=new Dog("Laika");
        System.out.println(d1.paw);

        Cat c1=new Cat("Mur");
        c1.sleep();
    }
}