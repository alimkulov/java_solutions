package kz.mylab.lesson6;

public class MethodOverloading2 {

    public int sum(int i1, int i2) {
        return i1+i2;
    }

    public String sum(String s1, String s2) {
        return s1+s2;
    }

    protected void sum(int a,int b, int c){
        System.out.println("something another");
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading2 mO2=new MethodOverloading2();

        int a =mO2.sum(1,2);
        System.out.println(a);

        String s=mO2.sum("Hello","Medved");
        System.out.println(s);
    }
}
