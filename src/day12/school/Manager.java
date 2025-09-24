package day12.school;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Manager extends Person {
    private Person[] manageList;
    private int index;
    private Scanner scan = new Scanner(System.in);

    public Manager(int size) {
        super("manager", 29);
        manageList = new Person[size];
    }


    public void addManageList(Person person) {
        if (manageList[index] == null) {
            manageList[index++] = person;
            System.out.printf(person.name + " is added to the manager list(Total : %d)\n", index);
        }
    }

    public Student makeStudentInstance(String name, int age) {
        Student student = new Student(name, age);
        addManageList(student);
        return student;
    }

    public Student makeStudentInstance() {
        commonInput();
        Student student = new Student(name, age);
        addManageList(student);
        return student;
    }

    public Teacher makeTeacherInstance(String name, int age, String subject) {
        Teacher teacher = new Teacher(name, age, subject);
        addManageList(teacher);
        return teacher;
    }

    public Teacher makeTeacherInstance() {
        commonInput();
        System.out.print("\nSubject : ");
        String subject = scan.nextLine();
        Teacher teacher = new Teacher(name, age, subject);
        addManageList(teacher);
        return teacher;
    }

    private void commonInput(){
        System.out.print("Name : ");
        name = scan.nextLine(); // temporary store name and age into the manager's fields.
        System.out.print("\nAge : ");
        age = scan.nextInt();
        scan.nextLine(); //buffer
    }

    public void printWholeProfile() {
        for (int i = 0; i < index; i++) {
            manageList[i].printProfile();
        }
    }

    public void findPerson(String name){
        String result=null;
        for(int i = 0; i<index; i++){
            if (name.equals(manageList[i].name)) {
                result = manageList[i].name;
            }
        }
        if ((result != null)) {
            System.out.println(result+" is listed");
        } else {
            System.out.println("not found");
        }

    }

}
