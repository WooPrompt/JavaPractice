package day3;

import java.util.Scanner;

public class Practice02 {
    /*
    초 단위의 숫자를 입력받아 시간, 분, 초 단위로 환산한다.

    초 단위를 입력하세요 : 3606
    1시간 0분 6초
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("초 단위를 입력하세요. : ");
        int secInput = scan.nextInt();
        int hour = secInput/3600;
        int min = (secInput%60)/60;
        int sec = secInput%3600;
        int a = secInput%60;
        System.out.println(hour+"시간 "+min+"분 "+sec+"초");

    }
}
