package day8;

public class Customer {
    String name;
    String ssn;
    String address;

    Customer(String name,String ssn,String address){
        this.name = name;
        this.ssn = ssn;
        this.address= address;
    }
    public static void printCustomerInfo(Customer customer) {
        System.out.println();
        System.out.printf("==== %s information ==== \n", customer.name);
        System.out.printf("address : %s \n", customer.address);
        System.out.println("=".repeat(50));
        System.out.println();
    }
    public static void main(String[] args) {
        Account account1 = new Account();
    }
}
