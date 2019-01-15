package demo.day04;

public class Test {
/*
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(5,6));
        System.out.println(calculator.add(1.1, 2.2)); // 浮点数精度损失
        System.out.println(calculator.add(1, 1.1)); // Ctrl + B
        System.out.println(calculator.add(1.1, 1));

        Square square = new Square(1.2);
        System.out.println(square.getArea());

        Shape s = new Shape();
        System.out.println(s.getArea());

        Shape s1 = new Square(2);//父类可以直接声明子类的实例

//        Square s2 = new Shape(); // 子类不能直接声明父类实例
        System.out.println(s1.getArea()); //
    }

    Human human=new Human("Tom",'M',16,1.68,false);
*/

    //test1
    /*public static void main(String[] args) {
    Student student = new Student(123456, "张三", 86);
        System.out.println(student.getName() + "的学号是" + student.getStudentNum() + ",成绩是" + student.getScores());
        student.setName("王五");
        student.setScores(94);
        student.setStudentNum(34567);
        System.out.println(student.getName() + "的学号是" + student.getStudentNum() + ",成绩是" + student.getScores());
        }*/

        //test2
        /*public static void main(String[] args) {
            Car car = new Car();
            System.out.println("汽车的颜色是：" + car.getColor() + "，型号是：" + car.getModel());
            car.setColor("黑色");
            car.setModel("轿车");
            System.out.println("汽车的颜色是：" + car.getColor() + "，型号是：" + car.getModel());
        }*/

    //test3
    public static void main(String[] args) throws Exception {
        Calendar test = new Calendar();
        System.out.println("今天是"+test.dayOfYear("2019-01-14"));
    }
}

