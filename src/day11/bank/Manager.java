package day11.bank;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Customer> customerList = new ArrayList<>();

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(Customer newCustomer){
        this.customerList.add(newCustomer);
    }
}
