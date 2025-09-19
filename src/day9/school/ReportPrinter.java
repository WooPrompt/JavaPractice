package day9.school;

public class ReportPrinter {
    public static void print(Student st){
        System.out.println("=".repeat(5)+st.getnName()+"님의 성적"+"=".repeat(5));
        System.out.printf("학번 : %s\n",st.getStudentID());
        System.out.printf("국어 성적 : %s점\n",st.getKorean());
        System.out.printf("영어 성적 : %s점\n",st.getEnglish());
        System.out.printf("수학 성적 : %s점\n",st.getMath());
        System.out.println("=".repeat(25));
    }
}
