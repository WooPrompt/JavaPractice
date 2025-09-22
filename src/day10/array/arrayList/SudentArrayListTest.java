package day10.array.arrayList;

public class SudentArrayListTest {
    public static void main(String[] args) {
        Student s = new Student("Hoo");
        Subject eng = new Subject();
        eng.subjectName = "English";
        eng.setGrade('A');
        eng.setScore(99);
        s.subjectList.add(eng);
        s.showStudentInfo();
    }
}
