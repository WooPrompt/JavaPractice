package day9.school;

public class StudentTest {

    public static void main(String[] args) {
        //student1 without score
        Student student1 = new Student("이영애", "170829");
        //점수부여 ( 국영수 한번에 점수부여)
        student1.grantScore("55", "66", "90");
        //학생의 성적 리포트 출력하기(리포트 출력기 클래스가 가진 static 메서드로)
        ReportPrinter.print(student1);
    }

}
