package kz.mylab.lesson6;

public class Student2 {

    int studentId;
    String studentName;
    String studentSurname;
    int year;
    float avgEconomic;
    float avgForeignlang;
    float avgMath;

    Student2(int _studentId, String _studentName, String _studentSurname,int _year,float _avgEconomic,float _avgForeignlang,float _avgMath) {
        this(_studentId,_studentName,_studentSurname,_year);
        avgEconomic=_avgEconomic;
        avgForeignlang=_avgForeignlang;
        avgMath=_avgMath;
    }

    Student2(int _studentId, String _studentName,String _studentSurname, int _year){
        studentId=_studentId;
        studentName=_studentName;
        studentSurname=_studentSurname;
        year=_year;
    }

    Student2() {

    }


}

class StudentTest2 {

    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student(1,"John","Deer",2019,4.5F,4.3F,3.4F);
        Student st3=new Student(2,"Harry","Potter",2001);



    }

    static float avgSubject(Student st) {
        float res;
        return res=(st.avgMath+st.avgForeignlang+st.avgEconomic)/3;
    }

}