package kz.mylab.homework22;

public class Student {

    private StringBuilder name;
    private byte course;
    private byte grade;

    public void setName(StringBuilder _name){
        if(_name.length()>=3){
            this.name=_name;
        }
    }

    public StringBuilder getName() {
        StringBuilder name2=new StringBuilder(name);
        return name2;
    }

    public void setCourse(byte _course){
         if(_course>0 && _course<5) {
             this.course=_course;
        }
    }

    public byte getCourse() {
     return this.course;
    }

    public void setGrade(byte _grade) {
       if(_grade>0 && _grade<11) {
           this.grade=_grade;
       }
    }

    public byte getGrage(){
        return this.grade;
    }

    public void showInfo() {
        System.out.println("Name: "+this.getName());
        System.out.println("Course: "+this.getCourse());
        System.out.println("Grade: "+this.getGrage());
    }

}

class TestStudent{

    public static void main(String[] args) {

        Student st = new Student();

        st.setName(new StringBuilder("John"));
        st.setCourse((byte)4);
        st.setGrade((byte)8);

        st.showInfo();

        st.setName(new StringBuilder("Jo"));
        st.setCourse((byte)6);
        st.setGrade((byte)12);
        st.showInfo();

    }
}
