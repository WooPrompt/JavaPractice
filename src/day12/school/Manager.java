package day12.school;


public class Manager extends Person {
    private Person[] manageList;
    private int index;



    public Manager(int size) {
        super("manager",29);
        manageList = new Person[size];
    }

    public void addManageList(Person person) {
        if(manageList[index]==null) {
            manageList[index++] = person;
            System.out.printf(person.name + " is added to the manager list(Total : %d)\n",index);
        }
    }

    public Student makeStudentInstance(String name, int age) {
        Student student = new Student(name,age);
        addManageList(student);
        return student;
    }

    public Teacher makeTeacherInstance(String name, int age, String subject) {
        Teacher teacher = new Teacher(name,age,subject);
        addManageList(teacher);
        return teacher;
    }

    public void printWholeProfile(){
        for(int i = 0; i<index;i++){
            manageList[i].printProfile();
        }
    }

}
