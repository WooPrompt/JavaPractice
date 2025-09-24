package day12.school;

public class Teacher extends Person{
    String subject;

    public Teacher(String name, int age,String subject){
        super(name,age);
        this.subject = subject;
    }

    @Override
    public void printProfile(){
        super.printProfile();
        System.out.printf(" , 과목 : %s\n",subject);
        System.out.println("저는 선생 입니다.");
    }
}
