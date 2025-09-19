package day9.school;

public class Student {

    final String nNum ; // 한번 정해지면 변하지 않음 -> 세터 비존재
    String nName;
    String korean;
    String English;
    String Math;

    Student(String nName,String nNum){
        this.nName = nName;
        this.nNum = nNum;
    }

    public void grantScore(String korean,String english , String math){
        this.setKorean(korean);
        this.setEnglish(english);
        this.setMath(math);
    }

    public String getnNum() {
        return nNum;
    }

    public String getnName() {
        return nName;
    }

    public String getKorean() {
        return korean;
    }

    public void setKorean(String korean) {
        this.korean = korean;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

    public String getMath() {
        return Math;
    }

    public void setMath(String math) {
        Math = math;
    }
}
