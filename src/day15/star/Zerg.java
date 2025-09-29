package day15.star;

public class Zerg extends Race {
    Zerg() {
        super.name = "Zerg";
    }

    @Override
    void specialSkill() {
        System.out.println("You can do what Zerg does");
    }
}

class Zergling extends Zerg implements Worker {
    Zergling() {
        super();
        System.out.println(name + " was generated");
    }

    @Override
    public void getMineral() {
        System.out.println("Zergling : extracting minerals");
    }

    @Override
    public void getGas() {
        System.out.println("Zergling : extracting gas");
    }

    @Override
    public void introduce() {
//        System.out.println("I am Zerg species worker");
        Worker.super.introduce();
    }
}
