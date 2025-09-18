package day8;

public class Account {
    String accountNumber;
    Customer customer;
    long balance;

    Account(){
    }

    Account(Customer customer,long balance){
        this.customer = customer;
        this.balance = balance;
    }
}
