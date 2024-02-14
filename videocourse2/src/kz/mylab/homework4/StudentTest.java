package kz.mylab.homework4;

public class StudentTest {

    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();

        float avgRes1;
        float avgRes2;

        st1.studentId=1;
        st1.year=2019;
        st1.studentName="John";
        st1.avgEconomic=4.5F;
        st1.avgForeignlang=4.3F;
        st1.avgMath=3.4F;
        avgRes1=(st1.avgMath+st1.avgForeignlang+st1.avgEconomic)/3;

        st2.studentId=2;
        st2.year=2020;
        st2.studentName="Harry";
        st2.avgEconomic=4.01F;
        st2.avgForeignlang=3.8F;
        st2.avgMath=2.7F;
        avgRes2=(st2.avgMath+st2.avgForeignlang+st2.avgEconomic)/3;

        System.out.println(st1.studentName+" avg:"+avgRes1);
        System.out.println(st2.studentName+" avg:"+avgRes2);
        System.out.println("Total avg:"+(avgRes1+avgRes2)/2);
    }
}
