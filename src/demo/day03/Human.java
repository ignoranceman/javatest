package demo.day03;

public class Human {

    // 1. 域：类似于变量的定义
    String name;
    char gender; // '男' '女' "Male" "Female"
    int age;
    double weight;
    double height;
    String idCardNumber;

    // 2. 方法
    // void：返回类型，没有返回任何值
    void study(int hours) {
        System.out.println(name + " is study " + hours + "hours.");
    }

    void work(int days) {
        System.out.println(name + " is work " + days + "days in this month.");
    }

    String getName() {
        return name;
    }

    void eat() {
    }

    void sleep() {
    }

    void walk() {
    }
    // 对象：Object 对象是具体的

    public static void main(String[] args) {
        Human tom = new Human();

        Human jerry = new Human();

        tom.name = "Tom";
        System.out.println(tom.name);

        tom.study(1);
    }
}
