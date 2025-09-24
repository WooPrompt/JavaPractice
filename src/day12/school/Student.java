package day12.school;

public class Student extends Person {
    private static int serial = 1000;
    private final int studentID;

    public Student(String name, int age){
        super(name,age);
        studentID = serial++;
    }


    public void printProfile(){
        System.out.printf("나이 : %d , 이름 : %s , 학번 : %d\n",age,name,studentID);
        System.out.println("저는 학생 입니다.");
    }
}
