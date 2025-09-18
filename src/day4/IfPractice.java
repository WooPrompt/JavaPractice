package day4;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        //시험 점수를 정수로 입력받기 0~100
        //80점 기준 합불합격, 90점 이상 a 80 b 70 c 60 d 60미만 F , 범위밖 혹은 음수 = 입력오류 출력
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요. :");
        int score = scan.nextInt();
        char grade='K';
        if (score >= 0 && score <= 100) {
            if (score >= 80) {
                System.out.println("합격");
                if (score >= 90) grade = 'A';
                else if (score<90 && score >= 80) grade = 'B';

            } else {
                System.out.println("불합격");
                if (score<80 && score >= 70) grade = 'C';
                else if (score<70 && score >= 60) grade = 'D';
                else grade = 'F';
            }
                System.out.println("등급:"+grade);
        } else System.out.println("범위 밖, 제대로 입력하세요.");
    scan.close();
    }
}
