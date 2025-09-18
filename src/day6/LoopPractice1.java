package day6;

import java.util.Scanner;

public class LoopPractice1 {
    public static void main(String[] args) {
        //정수 두개를 입력받아 시작값과 끝값으로서 스타트 ~ 엔드의 합계는 썸이다를 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. start : ");
        int start = sc.nextInt();
        System.out.println();
        System.out.print("정수를 입력하세요. end : ");
        int end = sc.nextInt();
        int sum = 0;

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start; end >= i; i++) {
            sum += i;
        }

        System.out.println(start + "부터 " + end + "까지의 합계는 " + sum + "이다. ");

    }
}
