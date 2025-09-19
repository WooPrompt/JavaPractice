package day9.school;

public class Student {

    private static int serialNum = 1000 ;
    private final int studentID ;// 한번 정해지면 변하지 않음 -> 세터 비존재
    private final String nName;
    private int korean;
    private int English;
    private int Math;

    Student(String nName){
        this.nName = nName;
        this.studentID = serialNum++;
    }

    public void grantScore(int korean,int english , int math){
        this.setKorean(korean);
        this.setEnglish(english);
        this.setMath(math);
    }

    public int getStudentID() {
        return studentID;
    }


    public String getnName() {
        return nName;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }
}
