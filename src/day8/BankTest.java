package day8;

import java.util.Scanner;

public class BankTest {
    public static Customer inputInfo(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("What is your name\nname : ");
        String name = sc.nextLine();
        System.out.print("What is your SSN\nSSN : ");
        String ssn = sc.nextLine();
        System.out.print("What is your address\nSSN : ");
        String address = sc.nextLine();
        return new Customer(name,ssn,address);
    }
    public static void printInfo(Customer customer){
        System.out.printf("==== %s information ==== \n",customer.name);
        System.out.printf("address : %s \n",customer.address);
        System.out.println();
    }
    public static void main(String[] args) {
        Customer customer1 = inputInfo();
        Customer customer2 = inputInfo();

        printInfo(customer1);
        printInfo(customer2);
        System.out.println(customer1.name);
    }
}
