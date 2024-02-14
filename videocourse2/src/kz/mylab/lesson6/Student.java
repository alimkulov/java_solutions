package kz.mylab.lesson6;

public class Student {
    int studentId;
    String studentName;
    String studentSurname;
    int year;
    float avgEconomic;
    float avgForeignlang;
    float avgMath;
    Student(int _studentId, String _studentName, String _studentSurname,int _year,float _avgEconomic,float _avgForeignlang,float _avgMath) {
       this(_studentId,_studentName,_studentSurname,_year);
       avgEconomic=_avgEconomic;
       avgForeignlang=_avgForeignlang;
       avgMath=_avgMath;
    }

    Student(int _studentId, String _studentName,String _studentSurname, int _year){
        studentId=_studentId;
        studentName=_studentName;
        studentSurname=_studentSurname;
        year=_year;
    }

    Student() {}

    void showInfo() {
        System.out.println("studentId:"+studentId+" studentName:"+studentName+" studentSurname:"+studentSurname+" year:"+year);
        System.out.println("avgEconomic:"+avgEconomic+" avgForeignlang:"+avgForeignlang+" avgMath:"+avgMath);
    }
}

class StudentTest {

    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student(1,"John","Deer",2019,4.5F,4.3F,3.4F);
        Student st3=new Student(2,"Harry","Potter",2001);

        st1.showInfo();
        st2.showInfo();
        st3.showInfo();

    }

    static float avgSubject(Student st) {
        float res;
        return res=(st.avgMath+st.avgForeignlang+st.avgEconomic)/3;
    }

}