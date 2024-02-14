package kz.mylab.homework12;

public class Student {

    String name;
    int course;
    double grade;

    Student(String _name, int _course, double _grade) {
        this.name=_name;
        this.course=_course;
        this.grade=_grade;
    }
}

class StudentTest11 {
    void compareStudents(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course==s2.course && s1.grade==s2.grade) {
            System.out.println("Both Stundents are totaly equals");
        }
        else {
            System.out.println("There has some difference between Students");
        }
    }

    void compareParamStudent(Student s1, Student s2) {

        if (s1.name.equals(s2.name)){
            System.out.println("Students names are equals");
            if (s1.course==s2.course){
                System.out.println("Students course are same");
                if(s1.grade==s2.grade){
                    System.out.println("Students are totaly equals");
                }
                else {
                    System.out.println("Students grade aren't equals");
                }
            }
            else {
                System.out.println("Students course aren't equals");
            }
        }
        else {
            System.out.println("Students have different names");
        }
    }

    public static void main(String[] args) {
        StudentTest11 st=new StudentTest11();

        Student s1=new Student("John",2,3.500045);
        Student s2=new Student("John",2,3.5);

        st.compareStudents(s1,s2);
        st.compareParamStudent(s1,s2);


    }
}
