package demo.homework;

import java.util.Random;

public class Poker {
    String[] name = {"张三", "李四", "王五", "赵六"};
    String[] color = {"♠", "♥", "♣", "♦"};
    String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "小王", "大王"};

    int max = 4;
    int min = 0;
    int max1 = 15;
    int min1 = 0;

    Random random = new Random();

    int l = random.nextInt(max) % (max - min + 1) + min;

    void lookPoker() {
/*
* 不知道如何实现去重
* */
        System.out.println(name[l] + "抓到的牌有：");
        for (int k = 0; k < 16; k++) {
            int i = random.nextInt(max) % (max - min + 1) + min;
            int j = random.nextInt(max1) % (max1 - min1 + 1) + min;
            if (numbers[j] == "大王" || numbers[j] == "小王") {
                System.out.println(numbers[j]);
            } else {
                System.out.println(color[i] + numbers[j]);
            }
        }

    }

    public static void main(String[] args) {
        Poker player1 = new Poker();
        player1.lookPoker();
        Poker player2 = new Poker();
        player2.lookPoker();
        Poker player3 = new Poker();
        player3.lookPoker();
        Poker player4 = new Poker();
        player4.lookPoker();
    }
}
