package day11;

class Shape {
    void draw() {
        System.out.println("drawing..");

    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing triangle");
    }
}

class Rectangular extends Shape {
    @Override
    void draw() {
        System.out.println("drawing rectangular");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();
        System.out.println(circle instanceof Circle);
        System.out.println(circle instanceof Shape);
//        System.out.println(circle instanceof Triangle);
    }
}
