package demo.day02;

import java.util.Scanner;

public class _6_Test {
    public static void main(String[] args) {
        System.out.println("请输入您的成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.println(score >= 85 ? "A" : (score >= 60 ? "B" : "C"));
    }
}
