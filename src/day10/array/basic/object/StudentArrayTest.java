package day10.array.basic.object;

public class StudentArrayTest {

    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("Kim",88);
        students[1] = new Student("Yoo",90);
        students[2] = new Student("Ho",88);

        for(Student st : students){
            st.showStudentInfo();
            System.out.println();
        }
    }
}
