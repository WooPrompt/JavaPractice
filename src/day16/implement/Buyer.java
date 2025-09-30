package day16.implement;

public interface Buyer {
    void buy();

    default void order() {
        System.out.println("Buyer orders something");
    }
}
