package day12.school;

public class Person {
    String name;
    int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printProfile(){
        System.out.printf("나이 : %d , 이름 : %s",age,name);
    }
}
