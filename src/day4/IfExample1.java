package day4;

import java.util.Scanner;

public class IfExample1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("나이를 입력하세요. : ");
        int age = scan.nextInt();
        if (age < 8) {
            System.out.println("학교에 다니지 않습니다.");
        }else if(age <14 ){
            System.out.println("초등학생 입니다.");
        }else if (age < 20) {
            System.out.println("중 고등학생 입니다.");
        }else {
            System.out.println("학교에 다니지 않습니다.");
        }
    }
}
