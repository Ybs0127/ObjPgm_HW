package main.java;


class Shape {
    void draw() {
        System.out.println("도형을 그립니다.");
    }
}


class Circle extends Shape {
    void draw() {
        System.out.println("원을 그립니다.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("사각형을 그립니다.");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("삼각형을 그립니다.");
    }
}

public class Homework7 {
    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for (Shape s : shapes) {
            s.draw();
        }


        for (Shape s : shapes) {
            if (s instanceof Circle) {
                System.out.println("Circle 객체입니다.");
            } else if (s instanceof Rectangle) {
                System.out.println("Rectangle 객체입니다.");
            } else if (s instanceof Triangle) {
                System.out.println("Triangle 객체입니다.");
            }
        }
    }
}

