package main.java;

// 부모 클래스
class Shape {
    void draw() {
        System.out.println("도형을 그립니다.");
    }
}

// 자식 클래스들
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

        // 다형성: 부모 타입으로 여러 자식 객체 참조
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for (Shape s : shapes) {
            s.draw(); // 동적 바인딩 — 실제 객체의 draw()가 실행됨
        }

        // instanceof 예시 (다운캐스팅)
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

