package zjw.loop;


import java.util.Random;
import java.util.Scanner;

//��һ������
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int luckNumber = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("��һ��0~99����");
            int guessNumber = scanner.nextInt();

            if (guessNumber > luckNumber) {
                System.out.println("����");
            } else if (guessNumber < luckNumber) {
                System.out.println("��С");
            } else {
                System.out.println("����");
                break;
            }
        }
    }
}