package day10.array.basic;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] scores = {515, 90, 100, 60, 88};
        char[] grades = new char[scores.length];
        printGrade(scores,grades);
    }

    public static char whatGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    public static void printGrade(int[] scores,char[] grades){
        for (int i = 0; i < scores.length; i++) {
            grades[i] = (scores[i] <= 100 && scores[i]>=0) ? whatGrade(scores[i]):'U';
            if(grades[i]!='U') System.out.print(grades[i] + " ");
            else if (grades[i]=='U') System.out.println("score["+i+"] : "+scores[i]+" is out of range.");
        }
    }
}
