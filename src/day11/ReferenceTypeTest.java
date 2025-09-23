package day11;

import day11.bank.Customer;

public class ReferenceTypeTest {
    public static void main(String[] args) {
        String st1 = "Hi";
        String st2 = "Hi";
        String st3 = new String("Hi");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st1 == st2);
        System.out.println(st1 == st3);
        System.out.println(st2 == st3);
        Customer c1 = new Customer("customer1");
        Customer c2 = new Customer("customer1");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));



    }
}
