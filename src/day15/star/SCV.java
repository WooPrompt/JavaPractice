package day15.star;

public class SCV extends Terran implements Worker {
    public SCV() {
        super();
        System.out.println(name + " was generated");
    }

    @Override
    public void getMineral() {
        System.out.println("SCV : extracting minerals");
    }

    @Override
    public void getGas() {
        System.out.println("SCV : extracting gas");
    }
}
