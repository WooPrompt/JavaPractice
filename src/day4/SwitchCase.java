package day4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("gold");
                break;
            case 2:
                System.out.println("silver");
                break;
            case 3:
                System.out.println("bronze");
                break;
            default:
                System.out.println("participation prize");
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Type your score\nscore : ");
        int score= sc.nextInt();
        sc.close();
        if (score>100||score<0) {
            System.out.println("The score is out of range");
            System.exit(0);
        }

        //학점출력
        char grade;
        boolean isFail=false;
        switch(score/10){
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                isFail=true;
                break;
            case 6 :
                grade = 'D';
                isFail=true;
                break;
            default:
                grade='F';
                isFail=true;
        }
        System.out.println("등급 : "+grade);
        if(isFail) System.out.println("you drop the test");
    }
}
