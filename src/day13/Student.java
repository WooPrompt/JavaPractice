package day13;

public class Student extends Person {
    private static int serial = 1000;
    private final int studentID;

    public Student(String name, int age) {
        super(name, age);
        studentID = serial++;
    }

    @Override
    public void printProfile() {
        super.printProfile();
        System.out.printf(" , 학번 : %d\n", studentID);
        System.out.println("저는 학생 입니다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
