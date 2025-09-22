package day10.array.arrayList;

import day10.array.basic.ArrayPractice;

import java.util.ArrayList;

public class Student {
    private String name;
    public ArrayList<Subject> subjectList;
    private int serial = 1000;
    private final int ID;

    public Student(String name ){
        this.name = name;
        this.ID = serial++;
        this.subjectList = new ArrayList<>();
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void showStudentInfo(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+ID);
        for(Subject s : subjectList){
            System.out.println(s.subjectName+"\n"+s.getScore()+"\n"+s.getGrade());
        }
    }

    public static void main(String[] args) {

    }
}
