package day10.array.basic.object;

import day10.array.basic.ArrayPractice;

public class Student {
    private String name;
    private int score;
    private String grade;
    private int serial = 1000;
    private final int ID;

    public Student(String name, int score ){
        this.score = score;
        this.grade= String.valueOf(ArrayPractice.whatGrade(this.score));
        this.name = name;
        this.ID = serial++;
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    public void showStudentInfo(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+ID);
        System.out.println("Score : "+score);
        System.out.println("Grade : "+grade);
    }

    public static void main(String[] args) {
    }
}
