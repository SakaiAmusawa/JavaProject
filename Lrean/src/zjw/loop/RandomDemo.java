package zjw.loop;


import java.util.Random;
import java.util.Scanner;

//猜一个数字
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入Y开始（N结束）猜数字游戏");

        int luckNumber = random.nextInt(100);
        String continue_game = scanner.next();

        while (continue_game.equals("Y") || continue_game.equals("y")) {
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
            //思考如何如何重新开始一句游戏
        }
    }
}