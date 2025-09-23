package day11.bank;

import java.util.Scanner;

public class BankUI {
    public static Scanner input = new Scanner(System.in);
    void printMainMenu() {
        System.out.println("-".repeat(30));
        System.out.println("Welcome to HSS Bank");
        System.out.println("1.Generate Account");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Transfer");
        System.out.println("5.Print");
        System.out.println("-".repeat(30));
    }

    int selectMenu(){
        System.out.println("Select the menu");
        int no = input.nextInt();
        return no;
    }
}
