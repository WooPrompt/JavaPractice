package day11.bank;

public class BankStory {
    private static Manager bankManager = new Manager();

    //Only bank manager can generate new customer list
    //When new customer is generated - based on the information new account (1) is created by constructor
    //When the account is created, adding the account to the customer's account list
    //Manager has her own customer list. enroll the customer on the list.
    public static void processCreateAccount() {
        Customer c1 = bankManager.createCustomer();
        Account a1 = bankManager.createAccount(c1);
        c1.getAccountList().add(a1);
//        bankManager.getCustomerList().add(c1);
        bankManager.addCustomer(c1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to HSS bank! ");
        System.out.println("1. Account creation");
        processCreateAccount();

    }

}
