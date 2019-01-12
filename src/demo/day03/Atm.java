package demo.day03;

public class Atm {

    String name;
    int account;
    String password;
    int date;
    String type;//存取款
    int deposit;

    void save(int money) {
        System.out.println(name + " saved to your account " + money + " dollors just now.");
    }

    void draw(int money) {
        System.out.println(name + " draw from your account " + money + " dollors just now.");
    }

    void balance(int balance) {
        System.out.println("Hi," + name + ". \nYour balance is " + balance + " dollors.");
    }

    public static void main(String[] args) {
        Atm tom = new Atm();
        tom.name = "Tom";
        tom.save(54321);
        tom.draw(12345);
        tom.balance(666666);
    }
}
