package day7;

import day4.IfPractice2;

import java.util.Scanner;

import static day4.IfPractice2.ageCalculator;
import static day4.IfPractice2.leapYearCalculator;
import static day7.BMICalculator.bmiExe;
import static day7.GugudanFuncion.gugudanExe;

public class MultiCalculator {
    public static void printMenu() {
        System.out.println("\n==다기능 계산기===");
        System.out.println("1. BMI 계산기");
        System.out.println("2. 윤년 계산기");
        System.out.println("3. 나이 계산기");
        System.out.println("4. 사칙연산 계산기");
        System.out.println("0. 프로그램 종료");
    }

    public static void basicArithmetic(){
        int n1 ;
        int n2 ;
        String operator ;
        String [] operatorArray ={"*","/","-","+"};
        boolean isNotZero = true;
        System.out.println("0을 입력하면 종료합니다.");

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("첫번째 숫자 입력");
            n1 = sc.nextInt();
            if (n1 == 0) {
                System.out.println("프로그램 종료 ");
                return;
            }
            sc.nextLine(); // buffer
            System.out.println("연산자 입력 \n *, / , + , -");
            operator = sc.nextLine();
            if (!operator.equals("*") && !operator.equals("/") &&
                    !operator.equals("+") && !operator.equals("-")) {
                System.out.println("이상한 걸 입력하셨네요.. ");
                return;
            }

            System.out.println("두번째 숫자 입력");
            n2 = sc.nextInt();
            if (n2 == 0) {
                System.out.println("프로그램 종료. ");
                return;
            }

            int result = switch (operator) {
                case "-" -> (n1 - n2);
                case "+" -> (n1 + n2);
                case "*" -> (n1 * n2);
                case "/" -> (n1 / n2);
                default -> throw new IllegalStateException("dd");
            };

            System.out.printf("연산 결과 : %d %s %d = %d\n", n1, operator, n2, result);
        }while(isNotZero);


    }

    public static void main(String[] args) {
        IfPractice2 yearCalculator = new IfPractice2();
        while(true){
            Scanner sc = new Scanner(System.in);
            printMenu();
            System.out.println("메뉴 선택 : ");
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> bmiExe();
                case 2 -> leapYearCalculator();
                case 3 -> ageCalculator();
                case 4 -> basicArithmetic();
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;//close main method
                }
                default -> throw new IllegalStateException("잘못 입력하셨습니다.");
            }
        }
    }
}
