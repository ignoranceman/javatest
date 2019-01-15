package demo.day04;

public class MathRandomNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            double x = (int)(1+Math.random() * 20);
            System.out.println("第"+i+"个[0-20]之间的随机数是"+x);
        }
    }
}
