package payment;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher t1= new Teacher(1, "Michael", 5000);
        Teacher t2= new Teacher(2, "John", 9000);
        Teacher t3= new Teacher(3, "Max", 6000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        Student s1= new Student(1, "Jenny", 40);
        Student s2= new Student(2, "Tom", 70);
        Student s3= new Student(3, "Martin", 50);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        School abc = new School(teacherList, studentList);
        s1.payFees(60000);
        s2.payFees(50000);
        Teacher t4 = new Teacher(6, "Margartia", 9000);
        abc.addTeacher(t4);
        System.out.println("school has earned " + abc.getTotalMoneyEarned() +" USD.");

        System.out.println(" --------- School's Pay Salary ------");
        t1.receiveSalary(t1.getSalary());
        System.out.println(
                "School has spent for salary to " + t1.getName() + " and now has " + abc.getTotalMoneyEarned() +" USD.") ;
        t2.receiveSalary(t2.getSalary());
        System.out.println(
                "School has spent for salary to " + t2.getName() + " and now has " + abc.getTotalMoneyEarned() +" USD.");
        t4.receiveSalary(t4.getSalary());

        System.out.println(
                "School has spent for salary to " + t4.getName() + " and now has " + abc.getTotalMoneyEarned() +" USD.");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(t2);

    }

}
