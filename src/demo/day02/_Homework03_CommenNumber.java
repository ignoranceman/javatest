package demo.day02;

import java.util.Scanner;

public class _Homework03_CommenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        int c, d, e;
        if (a < b) {
            d = a;
            a = b;
            b = d;
        }
        e = a * b;
        c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println("最大公约数是:" + b);
        System.out.println("最小公倍数是:" + e / b);
    }
}
