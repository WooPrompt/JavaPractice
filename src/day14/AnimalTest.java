package day14;

public class AnimalTest {
    public static void main(String[] args) {
//        Animal a = new Animal(); abstract class couldn't make an instance


        Lion l = new Lion();
        l.makeNoise();
        l.eat();

        Cat cat = new Cat();
        cat.makeNoise();
    }
}

abstract class Animal {
    String img;
    String food;
    int status;

    abstract void makeNoise() ;

    void eat() {
        System.out.println("Feeding : " + food);
    }

    void roam() {
        System.out.println("Wandering");
    }
}

class Lion extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Grrr...");
    }
}

class Cat extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Meow...");
    }


}
