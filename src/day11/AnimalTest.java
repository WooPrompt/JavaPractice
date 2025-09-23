package day11;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.food = "Beef";
        a.roam();
        a.eat();

        Lion l = new Lion();
        l.makeNoise();
        l.eat();

        Cat cat = new Cat();
        cat.makeNoise();
    }
}

class Animal {
    String img;
    String food;
    int status;

    void makeNoise() {
        System.out.println("Making sound");
    }

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
