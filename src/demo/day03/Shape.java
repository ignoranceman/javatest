package demo.day03;

public class Shape {

    public static void main(String[] args) {

/**
 * 正方形 Square
 * 长方形 Rectangle
 * 三角形 Triangle
 * 圆形 Circle
 */
        Square square = new Square();
        square.length = 10;
        square.width = 5;
        System.out.println("长方形的长是：" + square.length);
        System.out.println("长方形的宽是：" + square.width);
        System.out.println("长方形的面积是：" + square.getSquareArea());
        System.out.println("长方形的周长是：" + square.getSquarePerimeter());
        Rectangle rectangle = new Rectangle();
        rectangle.length=5;
        System.out.println("正方形的边长是：" + rectangle.length);
        System.out.println("正方形的面积是：" + rectangle.getRectangleArea());
        System.out.println("正方形的周长是：" + rectangle.getRectanglePerimeter());
        Triangle triangle = new Triangle();
        triangle.length=5;
        triangle.height=4;
        System.out.println("三角形的边长是：" + triangle.length);
        System.out.println("三角形的面积是：" + triangle.getTriangleArea());
        System.out.println("三角形的周长是：" + triangle.getTrianglePerimeter());
        Circle circle = new Circle();
        circle.radius=5;
        System.out.println("圆的半径是：" +circle.radius);
        System.out.println("圆的面积是：" + circle.getCircleArea());
        System.out.println("圆的周长是：" + circle.getCirclePerimeter());
    }

    double pi = 3.14;
    double width;
    double length;
    double height;
    double radius;

    public Shape() {
    }

    public Shape(double pi, double width, double length, double height, double radius) {
        this.pi = pi;
        this.width = width;
        this.length = length;
        this.height = height;
        this.radius = radius;
    }

    double getSquareArea() {
        return (this.width * this.length);
    }

    double getSquarePerimeter() {
        return (2 * (this.width + this.length));
    }

    double getRectangleArea() {
        return (this.length * this.length);
    }

    double getRectanglePerimeter() {
        return (4 * this.length);
    }

    double getTriangleArea() {
        return 0.5*(this.height * this.length);
    }

    double getTrianglePerimeter() {
        return (this.length + this.length + this.length);
    }

    double getCircleArea() {
        return (pi * radius * radius);
    }

    double getCirclePerimeter() {
        return (2 * pi * radius);
    }
}

class Square extends Shape {
}

class Rectangle extends Shape {

}

class Triangle extends Shape {

}

class Circle extends Shape {

}