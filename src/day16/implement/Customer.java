package day16.implement;

public class Customer implements Buyer,Seller{


    @Override
    public void buy() {
        System.out.println("Buying");
    }

    @Override
    public void order() {
//        Buyer.super.order();
        System.out.println("Customer orders something");
    }

    @Override
    public void sell() {
        System.out.println("Selling");
    }
}
