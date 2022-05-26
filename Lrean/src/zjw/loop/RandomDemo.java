package zjw.loop;


import java.util.Random;
import java.util.Scanner;

//猜一个数字
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int luckNumber = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
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
        }
    }
}