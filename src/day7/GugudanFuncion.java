package day7;

import java.util.Scanner;

public class GugudanFuncion {
    public static void gugudan(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.println(i + "x" + j + "=" + i * j);
        }
    }

    public static int scan() {
        Scanner sc = new Scanner(System.in);
        int scan = sc.nextInt();
        return scan;
    }

    public static void gugudanExe(){
        int inputNum;
        System.out.println("프로그램 시작 !");
        do {
            System.out.print("몇단을 할까요? (0을 입력하시면 종료합니다.) \n출력할 구구단의 단수 : ");
            inputNum = scan();
            if (inputNum == 0) {
                System.out.println("즐거웠습니다. 잘가요! ");
                break;
            }
            gugudan(inputNum);
        } while (true);
        //}while(inputNum !=0);
    }

    public static void main(String[] args) {
        gugudanExe();
    }
}

