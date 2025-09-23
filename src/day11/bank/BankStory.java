package day11.bank;

public class BankStory {


    //new customer creation
    {
        Manager bankManager = new Manager();
        Customer c1 = new Customer("Han","1234-99900","over the rainbow");
        Account a1 = new Account("555-5555-55555",55000,c1);
        c1.getAccountList().add(a1);
//        bankManager.getCustomerList().add(c1);
        bankManager.addCustomer(c1);
    }

    //Only bank manager can generate new customer list
    //When new customer is generated - based on the information new account (1) is created by constructor
    //When the account is created, adding the account to the customer's account list
    //Manager has her own customer list. enroll the customer on the list.


}
