package demo.day02;

public class _8_Switch {
    public static void main(String[] args) {
        char grade = 'A'; // char int String? JDK 1.7

        // 注意加不加break的区别
        
        switch (grade) {
            case 'A':
                System.out.println("优");
                break;
            case 'B':
                System.out.println("良");
                break;
            case 'C':
                System.out.println("中");
                break;
            case 'D':
                System.out.println("差");
                break;
            default:
                break;
        }
    }
}
