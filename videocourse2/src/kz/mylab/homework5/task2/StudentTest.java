package kz.mylab.homework5.task2;

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
        //st1.showInfo(st1);

        st2.studentId=2;
        st2.year=2020;
        st2.studentName="Harry";
        st2.avgEconomic=4.01F;
        st2.avgForeignlang=3.8F;
        st2.avgMath=2.7F;
     //   showInfo(st2);

        System.out.println(st1.studentName+" avg:"+avgSubject(st1) );
        System.out.println(st2.studentName+" avg:"+avgSubject(st2));
        System.out.println("Total avg:"+(avgSubject(st1)+avgSubject(st2) )/2);

    }

    static float avgSubject(Student st) {
        float res;
        return res=(st.avgMath+st.avgForeignlang+st.avgEconomic)/3;
    }

  //  void showInfo(Student st) {
  //      System.out.println(avgSubject(st));
   // }
}
