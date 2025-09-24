package day12.school;

public class SchoolTest {
    public static void main(String[] args) {
        Manager manager = new Manager(10);
        Teacher teacher = manager.makeTeacherInstance("kim",30,"English");
        Student student1 = manager.makeStudentInstance("yu",14);
//        Student student2 = manager.makeStudentInstance();
        Teacher teacher2 = manager.makeTeacherInstance();

        manager.printWholeProfile();

    }
}
