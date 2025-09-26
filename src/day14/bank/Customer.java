package day14.bank;

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

    public Customer(String name) {
        this.setName(name);
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

    public void getAccountDetail (){
        System.out.println();
        System.out.printf("-%s님의 보유 계좌 목록-\n",getName());
        System.out.println("=".repeat(50));
        for(int i =0 ; i<accountList.size(); i++){
            System.out.printf("%d. 계좌 번호 : %s , 잔고 : ￦%d\n",i+1,accountList.get(i).getAccountNumber(),accountList.get(i).getBalance());
        }
        System.out.println("=".repeat(50));

    }

    public Account getSpecificAccount(int index){
        return accountList.get(index);
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
}
