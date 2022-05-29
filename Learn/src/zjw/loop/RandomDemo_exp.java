package zjw.loop;

import java.util.Random;
import java.util.Scanner;
/*
部分思路来源于：
1.https://blog.csdn.net/weixin_52142731/article/details/111825215
2.
*/

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
        int time;
        int bound;
        System.out.println("-----------------------");
        System.out.println("- 1.难度一    2.难度二  -");
        System.out.println("-----------------------");
        System.out.print("请选择游戏难度（1 or 2 ）：");
        int time_Number = scanner.nextInt();
        switch (time_Number) {
            case 1 -> {
                bound = 100;
                time = 10;
            }
            case 2 -> {
                bound = 100;
                time = 5;
            }
            default -> {
                bound = 100;
                time = 999;
            }
        }
        int trueNumber = random.nextInt(bound) + 1;
        int num = 0;
        System.out.println(trueNumber);//直接输出答案便于测试
        while (time > 0) {
            System.out.print("请输入一个1~100之间的数：");
            int guessNumber = scanner.nextInt();
            if (guessNumber > trueNumber) {
                System.out.println("测得数大了");
            } else if (guessNumber < trueNumber) {
                System.out.println("测得数小了");
            } else {
                System.out.println("恭喜你猜中了，答案是：" + trueNumber + " " + "共计猜测" + (num + 1) + "次");
                System.out.println("剩余" + (time - 1) + "次！");
                break;
            }
            /*
            num++为下列程序的循环次数 也就是测错部分的次数  num+1在else{}内执行意味：当猜测正确时，所有猜错的次数加上这次猜对的次数即为猜测次数的总数
            if () {
            } else if () {
            }
             */
            num++;
            time--;
            System.out.println("剩余" + time + "次");
        }

    }
}
