package kz.mylab.homework2;

public class hw1 {

    public static void main(String[] args){
        byte b10=12; //10
        byte b8=014; //8
        byte b2=0b1100; //2
        byte b16=0xc; //16

        System.out.println(b8);

        short s10=-1300;
        short s8=-02424;
        short s2=-0b010100010100;
        short s16=-0x514;
        System.out.println(s10);
        System.out.println(s8);
        System.out.println(s2);
        System.out.println(s16);

        int i10=0;
        int i8=00;
        int i2=0b0;
        int i16=0x0;

        System.out.println(i10);
        System.out.println(i8);
        System.out.println(i2);
        System.out.println(i16);

        long l10=123456789L;
        long l8=0726746425L;
        long l2=0b0111010110111100110100010101L;
        long l16=0x75BCD15L;
        System.out.println(l10);
        System.out.println(l8);
        System.out.println(l2);
        System.out.println(l16);

        float f1=0.14F;
        float f2=1F;
        double d1=1;
        double d2=745.857445;

        boolean bool=true;
        boolean bool2=false;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(bool);
        System.out.println(bool2);

        char ch1='a';
        char ch2=65;
        char ch3='\u0430';

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }
}
