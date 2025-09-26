package day14.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private static Manager manager;
    private ArrayList<Customer> customerList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    public final String BANK_NO = "486";
    public final String AREA_NO = "6000";

    public static Manager getInstance() {
        if (manager == null) {
            manager = new Manager();
        }
        return manager;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(Customer newCustomer) {
        this.customerList.add(newCustomer);
    }

    public Customer createCustomer() {
        Customer c = null;
        System.out.print("이름 : ");
        String name = input.nextLine();
        System.out.print("주민등록번호 : ");
        String SSN = input.nextLine();
        System.out.print("주소 : ");
        String address = input.nextLine();
        c = new Customer(name, SSN, address);
        return c;
    }

    public Account createAccount(Customer c1) {
        Account a = null;
        String accountNumber = AccountIDGenerator.getAccID(BANK_NO, AREA_NO);
        System.out.println("계좌번호 : " + accountNumber);
        System.out.print("입금 금액 : ");
        long balance = input.nextLong();
        input.nextLine();
        return new Account(accountNumber, balance, c1);
    }

    public Customer searchCustomer(String ssn) {
        Customer c = null;
        for (Customer customer : customerList) {
            if (ssn.equals(customer.getSSN())) {
                c = customer;
            }
        }
        return c;
    }

    public Account searchAccount(String accNo) {
        Account acc = null;
        for (Customer c : customerList) {
            for (Account account : c.getAccountList()) {
                if (accNo.equals(account.getAccountNumber())) {
                    acc = account;
                }
            }
        }
        return acc;
    }

    public void getWholeCustomerAccInfo() {
        if (customerList != null) {
            for (int i = 0; i < customerList.size(); i++) {
                customerList.get(i).getAccountDetail();
            }
        } else {
            System.out.println("아직 관리고객이 없습니다.");
        }
    }


    public void deposit() {
        boolean notDone = true;
        System.out.println("[계좌입금]");
        System.out.print("입금 고객 주민번호 : ");
        String ssn = input.nextLine();
        if (searchCustomer(ssn) != null) {
            Customer c = searchCustomer(ssn);
            c.getAccountDetail();
            do {
                System.out.print("\n계좌 선택 :");
                int whichAccount = input.nextInt() - 1;
                input.nextLine();

                if (c.getAccountList().size() > whichAccount) {
                    Account selectedAccount = c.getSpecificAccount(whichAccount);
                    System.out.print("입금 금액 :");
                    int depositAmount = input.nextInt();
                    input.nextLine();
                    long deposit = selectedAccount.getBalance() + depositAmount;
                    selectedAccount.setBalance(deposit);
                    System.out.println("￦" + depositAmount + "원이 입금 됐습니다.");
                    System.out.printf("%s 계좌의 잔고는 ￦%d원 입니다.\n", selectedAccount.getAccountNumber(), deposit);
                    notDone = false;
                } else {
                    System.out.println("존재하지 않는 계좌입니다.");
                }
            } while (notDone);
        } else {
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }

    public void withdraw() {
        boolean notDone = true;
        System.out.println("[계좌출금]");
        System.out.print("출금 고객 주민번호 : ");
        String ssn = input.nextLine();
        if (searchCustomer(ssn) != null) {
            Customer c = searchCustomer(ssn);
            c.getAccountDetail();
            do {
                System.out.print("\n계좌 선택 :");
                int whichAccount = input.nextInt()-1;
                input.nextLine();
                if (c.getAccountList().size() > whichAccount) {
                    Account selectedAccount = c.getSpecificAccount(whichAccount );
                    System.out.print("출금 금액 :");
                    int withdrawAmount = input.nextInt();
                    input.nextLine();
                    if (withdrawAmount <= selectedAccount.getBalance()) {
                        long withdraw = selectedAccount.getBalance() - withdrawAmount;
                        selectedAccount.setBalance(withdraw);
                        System.out.println("￦" + withdrawAmount + "원이 출금 됐습니다.");
                        System.out.printf("%s 계좌의 잔고는 ￦%d원 입니다.\n", selectedAccount.getAccountNumber(), withdraw);
                        notDone = false;
                    } else {
                        System.out.println("잔고보다 많은 금액입니다.");
                    }
                } else {
                    System.out.println("목록 중에서 골라주세요.");
                }
            } while (notDone);
        } else {
            System.out.println("존재하지 않는 고객입니다.");
        }
    }

    public void transfer() {
        boolean notDone = true;
        System.out.println("[계좌이체]");
        System.out.print("이체 고객 주민번호 : ");
        String ssn = input.nextLine();
        if (searchCustomer(ssn) != null) {
            Customer c = searchCustomer(ssn);
            c.getAccountDetail();
            do {
                System.out.print("\n계좌 선택 :");
                int whichAccount = input.nextInt()-1;
                input.nextLine();
                if (c.getAccountList().size() > whichAccount) {
                    Account selectedAccount = c.getSpecificAccount(whichAccount);
                    System.out.print("이체 금액 :");
                    int transferAmount = input.nextInt();
                    input.nextLine();
                    System.out.print("이체 계좌번호 :");
                    String targetAccount = input.nextLine();
                    if (searchAccount(targetAccount) != null) {
                        Account targetAcc = searchAccount(targetAccount);
                        if (transferAmount <= selectedAccount.getBalance()) {
                            long transfer = selectedAccount.getBalance() - transferAmount;
                            selectedAccount.setBalance(transfer);
                            System.out.println("￦" + transferAmount + "원이 이체 됐습니다.");
                            System.out.printf("%s 계좌의 잔고는 ￦%d원 입니다.\n", selectedAccount.getAccountNumber(), transfer);
                            long received = targetAcc.getBalance() +transferAmount;
                            targetAcc.setBalance(received);
                            notDone = false;
                        } else {
                            System.out.println("잔고보다 많은 금액입니다.");
                        }
                    }else{
                        System.out.println("없는 계좌 번호입니다. 다시 입력해주세요.");
                    }
                } else {
                    System.out.println("목록 중에서 골라주세요.");
                }
            } while (notDone);
        } else {
            System.out.println("존재하지 않는 고객입니다.");
        }
    }
}


