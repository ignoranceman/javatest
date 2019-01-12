package demo.day03;

public class Test {

    public static void main(String[] args) {

        _3_Circle a3Circle = new _3_Circle(2.0, 3.0, 4.0, "black"); // Ctrl + P
        _3_Circle c = new _3_Circle();

//        a3Circle.x = 1.0;
//        a3Circle.y = 2.0;
//        a3Circle.radius= 3.0;

        System.out.println(a3Circle.getArea()); // ?
        System.out.println(a3Circle.getPerimeter());
        System.out.println(a3Circle.getX()); // ? null 0 "" 0.0
        System.out.println(a3Circle.getY()); // ?
        System.out.println(a3Circle.color); // ?
    }
}
