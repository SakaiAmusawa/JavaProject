package zjw.loop;

import java.util.Random;
import java.util.Scanner;
/*
����˼·��Դ�ڣ�
1.https://blog.csdn.net/weixin_52142731/article/details/111825215
2.
*/

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
        int time;
        int bound;
        System.out.println("-----------------------");
        System.out.println("- 1.�Ѷ�һ    2.�Ѷȶ�  -");
        System.out.println("-----------------------");
        System.out.print("��ѡ����Ϸ�Ѷȣ�1 or 2 ����");
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
        System.out.println(trueNumber);//ֱ������𰸱��ڲ���
        while (time > 0) {
            System.out.print("������һ��1~100֮�������");
            int guessNumber = scanner.nextInt();
            if (guessNumber > trueNumber) {
                System.out.println("���������");
            } else if (guessNumber < trueNumber) {
                System.out.println("�����С��");
            } else {
                System.out.println("��ϲ������ˣ����ǣ�" + trueNumber + " " + "���Ʋ²�" + (num + 1) + "��");
                System.out.println("ʣ��" + (time - 1) + "�Σ�");
                break;
            }
            /*
            num++Ϊ���г����ѭ������ Ҳ���ǲ���ֵĴ���  num+1��else{}��ִ����ζ�����²���ȷʱ�����в´�Ĵ���������β¶ԵĴ�����Ϊ�²����������
            if () {
            } else if () {
            }
             */
            num++;
            time--;
            System.out.println("ʣ��" + time + "��");
        }

    }
}
