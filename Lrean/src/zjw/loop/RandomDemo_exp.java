package zjw.loop;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo_exp {
    public static void main(String[] args) {
        guessNumberGame();
    }

    public static int menu() {
        System.out.println("***********************");
        System.out.println("  1��play      0��exit  ");
        System.out.println("***********************");
        System.out.println("����������ѡ��");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static void game() {
        Random random = new Random();
        int toGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("��������²������");
            int num = scanner.nextInt();
            if (num > toGuess) {
                System.out.println("�´���");
            } else if (num < toGuess) {
                System.out.println("��С��");
            } else {
                System.out.println("��ϲ�㣬�¶��ˣ�");
                break;
            }
        }
    }

    public static void guessNumberGame() {
        while (true) {
            int choice = menu();
            if (choice == 1) {
                game();
            } else if (choice == 0) {
                System.out.println("�װ�~");
                break;
            } else {
                System.out.println("�������������...");
            }
        }
    }


}
