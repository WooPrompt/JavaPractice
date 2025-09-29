package day15.star;

public class Protoss extends Race {
    Protoss() {
        super.name = "Protoss";
    }

    @Override
    void specialSkill() {
        System.out.println("You can do what Protoss does");
    }
}

class Zealot extends Protoss implements Worker {
    Zealot() {
        super();
        System.out.println();
    }

    @Override
    public void getMineral() {
        System.out.println("Zealot : extracting minerals");
    }

    @Override
    public void getGas() {
        System.out.println("Zealot : extracting gas");
    }
}
