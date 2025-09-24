package day12.school;

public class Teacher extends Person{
    String subject;

    public Teacher(String name, int age,String subject){
        super(name,age);
        this.subject = subject;
    }
    public void printProfile(){
        System.out.printf("나이 : %d , 이름 : %s , 과목 : %s\n",age,name,subject);
        System.out.println("저는 선생 입니다.");
    }
}
