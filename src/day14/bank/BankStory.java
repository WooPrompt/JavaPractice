package day14.bank;

public class BankStory {
    private static BankUI ui;
    private static Manager bankManager;

    public static void processCreateAccount() {
        while (true) {
            ui.printCreateAccountOpt();
            int no = ui.safeSelectMenu();

            switch (no) {
                case 1: {
                    Customer c1 = bankManager.createCustomer();
                    Account a1 = bankManager.createAccount(c1);
                    c1.getAccountList().add(a1);
                    bankManager.addCustomer(c1);
                    break;
                }
                case 2: {
                    String ssn = ui.inputSSN();
                    Customer c = bankManager.searchCustomer(ssn);
                    if (c != null) {
                        Account a2 = bankManager.createAccount(c);
                        c.getAccountList().add(a2);
                        break;
                    } else {
                        System.out.println("고객 검색 실패");
                        break;
                    }
                }


                case 3:
                    return;

                default:
                    System.out.println("메뉴에 없는 선택지입니다.");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        bankManager = Manager.getInstance();
        ui = BankUI.getInstance();

        while (true) {
            ui.printMainMenu();
            int no = ui.safeSelectMenu();
            switch (no) {
                case 1 -> processCreateAccount();
                case 2 -> bankManager.deposit();
                case 3 -> bankManager.withdraw();
                case 4 -> bankManager.transfer();
                case 5 -> bankManager.getWholeCustomerAccInfo();
                case 6 -> {
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                }
                default -> System.out.println("에러! 올바른 숫자를 입력하세요.");
            }
        }
    }

}
