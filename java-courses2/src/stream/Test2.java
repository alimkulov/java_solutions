package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Student st1=new Student("Ivan", 'm',22,3,8.3);
        Student st2=new Student("Nikolay", 'm',28,2,6.4);
        Student st3=new Student("Elena", 'f',19,1,8.9);
        Student st4=new Student("Petr", 'm',35,4,7);
        Student st5=new Student("Mariya", 'f',23,3,9.1);

        List<Student> students=new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students=students.stream().filter(el->el.getAge()>22&&el.getAvgGrade()<7.2).collect(Collectors.toList());
        System.out.println(students);

        System.out.println("---------Stream from scratch-------------------------");
        Stream<Student> myStream=Stream.of(st1,st2,st3,st4,st5);
        Set set1=myStream.filter(el->el.getAge()>22).collect(Collectors.toSet());
        System.out.println(set1);
    }
}



class Student {

    private  String name;
    private char gender;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char gender, int age, int course, double avgGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}