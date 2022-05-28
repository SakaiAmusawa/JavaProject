package zjw.loop;


import java.util.Random;
import java.util.Scanner;

//猜一个数字
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入Y开始（N结束）猜数字游戏");

        String continue_game = scanner.next();
        int luckNumber = random.nextInt(100);

        if (continue_game.equals("Y") || continue_game.equals("y")) {
            while (true) {
                System.out.println("猜一个0~99的数");
                int guessNumber = scanner.nextInt();
                if (guessNumber > luckNumber) {
                    System.out.println("过大");
                } else if (guessNumber < luckNumber) {
                    System.out.println("过小");
                } else {
                    System.out.println("猜中");
                    break;
                }
                //思考如何重新开始一局游戏
            }
        } else if (continue_game.equals("N") || continue_game.equals("n")) {
            System.out.println("游戏退出");
        }
    }
}