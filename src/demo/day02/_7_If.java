package demo.day02;

public class _7_If {
    public static void main(String[] args) {
        int score = 90;
//      注意if和else if的区别
        //if嵌套快捷键：敲完if之后Ctrl + Alt + T + 数字
        if (score > 85) {
            System.out.println("A");
        } else if (score > 70) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
