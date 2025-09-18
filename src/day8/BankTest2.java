package day8;

import java.util.Scanner;

public class BankTest2 {


    public static Customer inputCustomerInfo(String name, String ssn, String address) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("=".repeat(50));
//        System.out.println("Enter your information");
//        System.out.print("What is your name\nname : ");
//        System.out.println(name);
//        System.out.print("What is your SSN\nSSN : ");
//        System.out.println(ssn);
//        System.out.print("What is your address\nSSN : ");
//        System.out.println(address);
        return new Customer(name, ssn, address);
    }

    public static Account inputAccountInfo(String accountNumber, Customer customer, long balance) {
//        System.out.println("=".repeat(50));
//        System.out.println("Enter your information");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Account Number : ");
//        System.out.println(accountNumber);
//        System.out.print("Customer name : ");
//        System.out.println(customer.name);
//        System.out.print("Balance : ");
//        System.out.println(balance);
//        System.out.println("=".repeat(50));
        System.out.println(customer.name + " 계좌 개설성공 ");
        return new Account(accountNumber, customer, balance);
    }

    // 손님 등장 , 계좌개설 , 손님2 등장, 손님1 추가입금 , 손님2 출금 , 손님1이 손님2에게 송금
    public static void main(String[] args) {
        System.out.println("Bank Test starting...");
        System.out.println("=".repeat(50));
        System.out.println();
        Customer customer1 = inputCustomerInfo("고객1", "232131223-141411", "default address");
        Customer customer2 = inputCustomerInfo("고객2", "232131223-141411", "default address");
        Account account1 = inputAccountInfo("111111111", customer1, 5000);
        Account account2 = inputAccountInfo("22222222", customer2, 6000);

        System.out.println(customer1.name+"님이 입금을 합니다.");
        account1.deposit(5000);
        System.out.println(customer2.name+"님이 출금을 합니다.");
        account2.withdraw(50000);
        System.out.println();

        //송금
        long transferAmount = 500;
        System.out.println(customer1.name+"이 "+customer2.name+"에게 "+transferAmount+"원을 송금합니다.");
        account2.transfer(account1,account2,transferAmount);
        account2.printAccountInfo();

    }
}
