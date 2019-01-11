package demo.day02;

import java.util.Scanner;

/**
 * 运算符
 * 1,2,3. 算术运算符
 * 4,5,6. 关系运算符
 * 7. 逻辑运算符
 * 8. 位运算
 * 9. 条件运算符 三目
 */
public class _5_Opreator {
    public static void main(String[] args) {
//        1.加减乘除
        int x = 1;
        int y = 2;

        int z = x + y;
        System.out.println(z);

        z = x - y;
        System.out.println(z);

        z = x * y;
        System.out.println(z);

        z = x / y;
        System.out.println(z);

        z = x % y;
        System.out.println(z);

        // 2. ++ 自增
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);

        // 3.-- 自减
        x = 1;
        System.out.println(x--);
        System.out.println(x--);
        System.out.println(--x);
        System.out.println(x);
//        4.比较运算符

        double a = 1.2;
        double b = 3.4;

        // 5.行复制快捷键 Ctrl + D
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // 6. Java String pool
        // 字符串池，比较字符串内存位置
        String s1 = "hello";
//        String s2 = "Hello";
        String s2 = new String("hello");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

        //       7.
        boolean t = true;
        boolean f = false;

        System.out.println(t & f); // false
        System.out.println(t | f); // true
        System.out.println(t ^ f); // true 异或
        System.out.println(!f); // true
        System.out.println(!t); // false

        System.out.println(t && f); // false
        System.out.println(t || f); // true

        // & | 逻辑
        // && || 条件
        // 1. 他们的运算结果是一样的
        // 2. 短路规则

//        8.位运算
//        9.条件运算符 三目
        String str1 = "hello";
        String str2 = "hi";

        int n = (str1.length() < str2.length()) ? 1 : 2;
        System.out.println(n);
    }
}