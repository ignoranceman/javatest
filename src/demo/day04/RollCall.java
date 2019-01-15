package demo.day04;

import java.util.Random;
import java.util.Scanner;

public class RollCall {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print("现在点到的同学是：");
            new Scanner(System.in).nextLine();//通过scanner函数获取键盘输入的值，nextline可以读取到包括空格在内的字符
            RollCall rollCall = new RollCall();//实例化对象
            rollCall.RollCall();//调用rollcall方法
        }
    }

    String[] roll = {"陈月芳", "刘立超", "邓超元", "赵明睿", "赵晨锦", "金谡", "杨斌",
            "杨恒", "李静雅", "王雅雯", "王强", "师尧", "吴凯平", "韩思远", "陈慧慧",
            "李欣", "王一茗", "李奕霖", "苏宏月", "赵灿"};//定义数组通过读取数组的元素值实现输出

    void RollCall() {
        Random random = new Random();//利用random函数获取随机数
        int k = roll.length;//用k获取数组长度
        int i = random.nextInt(k);//读取随机数并赋值给i，同时用k来保证不超过数组长度
        System.out.println(roll[i]);
    }
}