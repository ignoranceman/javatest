package demo.day02;

public class _Homework02_arcissisticNumber {
    public static void main(String[] args) {
        System.out.println("1000以内的水仙花数有：");
        for (int i = 101; i <=999 ; i++) {
            if(i==(i/100)*(i/100)*(i/100)+((i/10)%10)*((i/10)%10)*((i/10)%10)+(i%10)*(i%10)*(i%10)){
                System.out.println(i);
            }
        }
    }
}
