package multithreading;

public class Ex5 {
    public static void main(String[] args) {
         MyThread5 myThread5=new MyThread5();
        System.out.println("Name of myThread5="+myThread5.getName()+
                " Priority of myThread5="+myThread5.getPriority());
        MyThread5 myThread6=new MyThread5();
        System.out.println("Name of myThread6="+myThread6.getName()+
                " Priority of myThread6="+myThread6.getPriority());

    }
}

class MyThread5 extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}