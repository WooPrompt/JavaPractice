package day6;

import java.util.Scanner;

public class LoopPractice2 {
    public static void main(String[] args) {
        //정수를 입력받아 합계를 구한다
        // 입력받은 정수가 0이면 무조건 종료한다
        // while , do-while , for 세가지 버전
        Scanner sc = new Scanner(System.in);

        int inputInt;
        int i = 1;
        int sum = 0;
        int prevSum;

        //Do while
        do{
            System.out.print("정수 "+i+++"번째 : ");
            inputInt = sc.nextInt();
            prevSum = sum;
            sum += inputInt;
            System.out.println(prevSum+"+"+inputInt+"="+sum);
        }while(inputInt != 0);

        //While
//        while(true){
//            System.out.print("정수 "+i+++"번째 : ");
//            inputInt = sc.nextInt();
//
//            if(inputInt == 0) break;
//            prevSum = sum;
//            sum += inputInt;
//            System.out.println(prevSum+"+"+inputInt+"="+sum);
//        }
//     }

        //For

//        for (; true; i++) {
//            System.out.print("정수 " + i++ + "번째 : ");
//            inputInt = sc.nextInt();
//
//            if (inputInt == 0) break;
//            prevSum = sum;
//            sum += inputInt;
//            System.out.println(prevSum + "+" + inputInt + "=" + sum);
//
//        }
    }
}
