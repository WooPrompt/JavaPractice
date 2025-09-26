package day14.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankUI {

    private static BankUI instance ;

    public static BankUI getInstance(){
        if(instance == null) {
            instance = new BankUI();
        }
        return instance;
    }

    public static Scanner input = new Scanner(System.in);

    void printMainMenu() {
        System.out.println();
        System.out.println("───────────\n" +
                "[Welcome to ABC Bank]\n" +
                "1. 계좌생성\n" +
                "2. 입금\n" +
                "3. 출금\n" +
                "4. 이체\n" +
                "5. 전체출력\n" +
                "6. 종료\n" +
                "───────────");
        System.out.println();
    }

    int selectMenu(){
        System.out.print("메뉴를 선택하세요 : ");
        int no = input.nextInt();
        input.nextLine();
        return no;
    }

    // In BankUI class
    public int safeSelectMenu() {
        while (true) {
            try {
                return selectMenu();
            } catch (InputMismatchException e) {
                System.out.println("올바른 숫자를 입력해주세요.");
                input.nextLine(); // Clear invalid input
                continue;
            }
        }
    }

    String inputSSN(){
        System.out.print("고객 주민번호를 입력하세요 : ");
        String ssn = input.nextLine();
        return ssn;
    }

    public void printCreateAccountOpt() {
        System.out.println("───────────\n" +
                "[계좌생성]\n" +
                "1. 신규고객\n" +
                "2. 기존고객\n" +
                "3. 상위메뉴\n" +
                "───────────");
    }
}
