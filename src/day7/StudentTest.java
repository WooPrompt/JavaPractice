package day7;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        System.out.println("Executing Testing method");
        Student student = new Student();
        student.grade = 4;
        student.studentName = "yeeun";
        student.goToSchool(7);

        Person person1 = new Person("yeeun");
        Person person2 = new Person();

        System.out.println(person1.name + "\t" + person2.name);
    }
}
