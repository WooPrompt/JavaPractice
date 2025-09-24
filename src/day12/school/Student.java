package day12.school;

public class Student extends Person {
    private static int serial = 1000;
    private final int studentID;

    public Student(String name, int age){
        super(name,age);
        studentID = serial++;
    }


    public void printProfile(){
        super.printProfile();
        System.out.printf(" , 학번 : %d\n",studentID);
        System.out.println("저는 학생 입니다.");
    }
}
