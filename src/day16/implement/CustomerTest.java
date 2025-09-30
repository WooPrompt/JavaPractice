package day16.implement;

public class CustomerTest {
    public static void main(String[] args) {
        //Customer role 1.buyer 2.seller
        Customer c = new Customer();
        c.buy();
        c.sell();
        c.order();

        Buyer b = c;
        b.order();
        b.buy();

        Seller s = c;
        s.order();
        s.sell();

        if (s instanceof Customer) {
            Customer c1 = (Customer) s;
            c1.buy();
            c1.sell();
        }

        if (b instanceof Customer c2) {
            c2.buy();
            c2.sell();
        }

    }
}
