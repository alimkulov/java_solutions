package kz.mylab.homework6;

public class Task1 {
    int sumCelih() {
        return 0;
    }

    int sumCelih(int a) {
        return  a;
    }

    int sumCelih(int a, int b) {
        return a+b;
    }
     int sumCelih(int a, int b, int c) {
        return a+b+c;
     }
}

class Task1Test{
    public static void main(String[] args ) {
        Task1 t=new Task1();

        System.out.println(t.sumCelih());
        System.out.println(t.sumCelih(4));
        System.out.println(t.sumCelih(7,5));
        System.out.println(t.sumCelih(9,5,3));

    }
}