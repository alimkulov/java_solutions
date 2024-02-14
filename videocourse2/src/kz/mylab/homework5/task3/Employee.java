package kz.mylab.homework5.task3;

public class Employee {
     int id;
     String surname;
     int age;
     float salary;
     String department;

     Employee(int _id, String _surname, int _age, float _salary, String _department) {
          id=_id;
          surname=_surname;
          age=_age;
          salary=_salary;
          department=_department;
     }

     float twiceSalary() {
          return  salary*2;
     }

}


class EmployeeTest{
     public static void main(String[] args) {
          Employee ep=new Employee(1,"John",25,200F,"IT");
          //ep.twiceSalary();
          System.out.println(ep.twiceSalary());
     }
}