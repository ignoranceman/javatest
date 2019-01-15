package demo.homework;

import java.util.Scanner;

public class Atm {
    int Account = 123456;
    int password = 123456;
    double balance = 1000.0;
    
    /**
     * 插卡登录
     */
    public void login() {
        Scanner sc = new Scanner(System.in);
        int cardNumber = sc.nextInt();
        if (cardNumber == Account) {
            System.out.println("读卡成功");
        } else {
            System.out.println("读卡失败");
            login();
        }
    }

    /**
     * 密码验证
     *
     * @param psw：密码
     */
    public void password() {
        Scanner sc = new Scanner(System.in);
        int psw = sc.nextInt();
        if (psw == password) {
            System.out.println("密码验证成功");
        } else {
            System.out.println("密码验证失败,请重新输入");
            password();
        }
    }

    /**
     * 存款取款
     *
     * @param 存取款
     */
    public void access() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择存款OR取款(1.存款  2.取款  3.查询余额  4.修改密码  5.退出卡片):");
        String flag = sc.next();
        if (flag.equals("1")) {
            System.out.println("请输入存款金额:");
            double money = sc.nextDouble();
            balance += money;
            System.out.println("存款成功，当前余额:" + balance);
            access();
        } else if (flag.equals("2")) {
            System.out.println("请输入取款金额:");
            double money = sc.nextDouble();
            if (balance >= money) {
                balance -= money;
                System.out.println("存款成功，当前余额:" + balance);
                access();
            } else {
                System.out.println("余额不足");
                access();
            }
        } else if (flag.equals("3")) {
            System.out.println("您的账户余额是：" + balance);
            access();
        } else if (flag.equals("4")) {
            modifiyPassword();
            access();
        } else if (flag.equals("5")) {
            System.out.println("卡片已拔出，请收好您的卡片");
            access();
        }
    }

    /**
     * @param psw：旧密码
     * @param newPsw：新密码
     */
    public void modifiyPassword() {
        int psw = 123456;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入旧密码:");
        int password = sc.nextInt();
        if (password == psw) {
            System.out.println("验证成功，请输入新密码：");
            int newPsw = sc.nextInt();
            psw = newPsw;
            System.out.println("修改成功");
        } else {
            System.out.println("旧密码错误");
            modifiyPassword();
        }
    }

    public static void main(String[] args) {
        Atm login = new Atm();
        System.out.println("请输入您的卡号");
        login.login();
        System.out.println("请输入您的密码");
        login.password();
        login.access();
    }
}
