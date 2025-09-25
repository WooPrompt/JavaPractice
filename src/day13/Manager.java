package day13;


import java.util.ArrayList;
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
            System.out.printf(person.toString() + " is added to the manager list(Total : %d)\n", index);
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
            if(manageList[i]!=null) System.out.println(manageList[i].toString());
        }
    }

    public void findPerson(String name){
        ArrayList<Person> result= new ArrayList<>();
        for(int i = 0; i<index; i++){
            if (name.equals(manageList[i].name)) {
                result.add(manageList[i]);
            }
        }
        if ((!result.isEmpty())) {
            System.out.println(name+" 이름을 가진 사람을 ("+result.size()+" 명 찾았습니다.)");
        } else {
            System.out.println(name+": not found");
        }

    }

    public void deletePerson(String name){
        int writeIndex  = 0;
        int foundCount = 0;

        for(int i = 0; i<manageList.length; i++){
            if(manageList[i] !=null && name.equals(manageList[i].name)){
                foundCount++;
            }
            else{
                manageList[writeIndex] = manageList[i];
                writeIndex++;
            }
        }

        if(foundCount == 0){
            System.out.println(name+"님을 찾을 수 없습니다.");
        }else{
            for(int i = writeIndex; i< index; i++){
                manageList[i] = null;
            }

            index = writeIndex;

            System.out.println(name+"님의 정보 "+foundCount+"건을 삭제했습니다.");
        }
    }

}
