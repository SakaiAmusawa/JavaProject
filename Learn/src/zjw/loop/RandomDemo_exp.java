package zjw.loop;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo_exp {
    public static void main(String[] args) {
        Choose();
    }

    public static String menu() {
        System.out.println("-----------------------");
        System.out.println("- Y.��ʼ��Ϸ  N.�˳���Ϸ -");
        System.out.println("-----------------------");
        System.out.print("��ѡ���Ƿ�ʼ��Ϸ��");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void Choose() {
        while (true) {
            String choose = menu();
            if (choose.equals("Y") || choose.equals("y")) {
                guess();
            } else if (choose.equals("N") || choose.equals("n")) {
                System.out.println("��Ϸ�˳�");
                break;
            } else {
                System.out.println("�������");
            }
        }

    }

    public static void guess() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int trueNumber = random.nextInt(100) + 1;
        System.out.println(trueNumber);
        while (true) {
            System.out.print("������һ��1~100֮�������");
            int guessNumber = scanner.nextInt();
            if (guessNumber > trueNumber) {
                System.out.println("���������");
            } else if (guessNumber < trueNumber) {
                System.out.println("�����С��");
            } else {
                System.out.println("��ϲ������ˣ����ǣ�" + trueNumber);
                break;
            }
        }
    }
}
