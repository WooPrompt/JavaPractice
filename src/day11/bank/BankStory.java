package day11.bank;

public class BankStory {
    private static Manager bankManager = new Manager();
    private static BankUI ui = new BankUI();

    //Only bank manager can generate new customer list
    //When new customer is generated - based on the information new account (1) is created by constructor
    //When the account is created, adding the account to the customer's account list
    //Manager has her own customer list. enroll the customer on the list.
    public static void processCreateAccount() {
        while(true){

            ui.printCreateAccountOpt();
            int no = ui.selectMenu();

            switch (no){
                case 1 : {
                    Customer c1 = bankManager.createCustomer();
                    Account a1 = bankManager.createAccount(c1);
                    c1.getAccountList().add(a1);
//        bankManager.getCustomerList().add(c1);
                    bankManager.addCustomer(c1);
                }
                case 2 : {
                    String ssn = ui.inputSSN();
                    //Check whether this customer is exsited in manager's customer list
                    Customer c = bankManager.searchCustomer(ssn);
                    if (c !=null){
                    Account a2 = bankManager.createAccount(c);
                    c.getAccountList().add(a2);
                    }
                    else {
                        System.out.println("Fail to search customer");
                    }
                }

                case 3 : return;

                default :
                    System.out.println("Not exsiting menu number");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to HSS bank! ");
        while (true) {
            ui.printMainMenu();
            int no = ui.selectMenu();
            switch (no) {
                case 1 -> processCreateAccount();
                default -> System.out.println("Error..");
            }
        }
    }

}
