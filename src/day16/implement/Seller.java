package day16.implement;

public interface Seller {
    //When you implement the method , it should be public since the interface's methods are automatically abstract public abstract method.
    void sell();

    default void order(){
        System.out.println("Seller orders something");
    }
}
