package day11.bank;

import java.util.ArrayList;

public class Customer {
    private String Name;
    private String SSN;
    private String address;
    private ArrayList<Account> accountList = new ArrayList<>();

    public Customer(String name, String SSN, String address) {
        Name = name;
        this.SSN = SSN;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
}
