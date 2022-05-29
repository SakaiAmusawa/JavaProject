package zjw.loop;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo_exp {
    public static void main(String[] args) {
        Choose();
    }

    public static String menu() {
        System.out.println("-----------------------");
        System.out.println("- Y.开始游戏  N.退出游戏 -");
        System.out.println("-----------------------");
        System.out.print("请选择是否开始游戏：");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void Choose() {
        while (true) {
            String choose = menu();
            if (choose.equals("Y") || choose.equals("y")) {
                guess();
            } else if (choose.equals("N") || choose.equals("n")) {
                System.out.println("游戏退出");
                break;
            } else {
                System.out.println("输入错误");
            }
        }

    }

    public static void guess() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int trueNumber = random.nextInt(100) + 1;
        System.out.println(trueNumber);
        while (true) {
            System.out.print("请输入一个1~100之间的数：");
            int guessNumber = scanner.nextInt();
            if (guessNumber > trueNumber) {
                System.out.println("测得数大了");
            } else if (guessNumber < trueNumber) {
                System.out.println("测得数小了");
            } else {
                System.out.println("恭喜你猜中了，答案是：" + trueNumber);
                break;
            }
        }
    }
}
