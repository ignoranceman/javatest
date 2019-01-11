package demo.day02;

public class _10_While {
    public static void main(String[] args) {
//注意do while循环（先执行后判断）和 while do循环（先判断后执行）
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
        int i = 9;
//        System.out.println("-------------");
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}
