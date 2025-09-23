package day11;

import java.util.ArrayList;

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
    void print(){
        System.out.println("print");
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
        ArrayList<Shape> shapeList = new ArrayList<>();
        Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();

        Triangle triangle = new Triangle();
        Rectangular rect = new Rectangular();
        System.out.println(circle instanceof Circle);
        System.out.println(circle instanceof Shape);
//        System.out.println(circle instanceof Triangle);

        shapeList.add(shape);
        shapeList.add(circle);
        shapeList.add(triangle);
        shapeList.add(rect);

        for(Shape s : shapeList){
            s.draw();
        } for(Shape s : shapeList){

            //check the instance type
            if (s instanceof Circle){
                //type conversion
                Circle circleType = (Circle)s;
                circleType.print();
            }else {
                System.out.println("Not Supported action");
            }
        }

    }
}
