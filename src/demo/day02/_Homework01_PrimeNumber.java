package demo.day02;

public class _Homework01_PrimeNumber {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            for (int j = 2; j <= i; j++) {

                if (i == j && i % j == 0) {
                    System.out.println(i);
                }
                if (i != j && i % j == 0) {
                    break;
                }
            }
        }
    }
}