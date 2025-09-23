package day11.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<Customer> customerList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    public final String BANK_NO = "486";
    public final String AREA_NO = "6000";

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(Customer newCustomer) {
        this.customerList.add(newCustomer);
    }

    public Customer createCustomer() {
        Customer c = null;
        System.out.println("Name : ");
        String name = input.nextLine();
        System.out.println("SSN : ");
        String SSN = input.nextLine();
        System.out.println("Address : ");
        String address = input.nextLine();
        c = new Customer(name, SSN, address);
        return c;
    }

    public Account createAccount(Customer c1) {
        Account a = null;
        String accountNumber = AccountIDGenerator.getAccID(BANK_NO,AREA_NO);
        System.out.println("Initial Balance : ");
        long balance = input.nextLong();
        return new Account(accountNumber, balance, c1);
    }
}
