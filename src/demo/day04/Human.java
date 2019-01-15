package demo.day04;

/**
 * 封装性
 *
 * 包 package
 * 组织类的目录结构
 *
 * 访问限定修饰符
 *
 * 类的访问方式
 *      public 公有 所有包都可以访问
 *      default 缺省 只有当前包可以访问
 *
 *
 * 类成员的访问方式
 *      public
 *      default
 *      private 私有 只有当前类内部可以访问
 *      protected 受保护的 同一个包可以访问，外包中当前类的子类的实例可以访问
 *
 *
 * 结论：
 * 类一般是公有的
 * 域一般是私有的
 * 方法一般是公有的
 *
 * Human 类重写
 *
 * 在 Test 中怎么获取 name 的值？
 * 在 Test 中怎么修改 name 的值？
 *
 */


public class Human {

    private String name;
    private char gender;
    private int age;
    private double height;
    private boolean married;

    public Human() {

    }

    public Human(String name, char gender, int age, double height, boolean married) {

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public void study(){
        test();
        System.out.println(name + " is studying...");
    }

    public void work() {
        test();
        System.out.println(name + " is working...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    void test(){

    }
}
