package day14.bank;

public class Account {
    private String accountNumber;
    private long balance;
    private Customer customer;
    private int serialNum = 1000;

    public Account(String accountNumber, long balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private void transfer(Customer c){

    }

    @Override
    public String toString() {
        return "계좌번호 : " + accountNumber  +
                ", 잔고 : ￦" + balance;
    }
}
