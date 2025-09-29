package day15.star;

public interface Worker {
    void getMineral();

    void getGas();

    default void introduce() {
        System.out.println("I am a worker");
    }
}
