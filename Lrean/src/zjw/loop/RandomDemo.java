package zjw.loop;


import java.util.Random;
import java.util.Scanner;

//��һ������
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("����Y��ʼ��N��������������Ϸ");

        String continue_game = scanner.next();
        int luckNumber = random.nextInt(100);

        if (continue_game.equals("Y") || continue_game.equals("y")) {
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
                //˼��������¿�ʼһ����Ϸ
            }
        } else if (continue_game.equals("N") || continue_game.equals("n")) {
            System.out.println("��Ϸ�˳�");
        }
    }
}