package demo.day04;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            Random random = new Random();
            int x = random.nextInt(20) + 1;
            System.out.println("第" + i + "个[0-20]之间的随机数是" + x);
        }
    }
}
