package zjw.Array.Demo;

import java.util.Random;
import java.util.Scanner;

public class ArrayTraverseDemo_GuessNumber {
    public static void main(String[] args) {
        //����5��1-20֮�������������û��£�������ʾ������������������е�һ�γ��ֵ�����������ӡ��������ݳ���
        //û�в��������
        Random random = new Random();
        int[] data = new int[5];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(20) + 1;
        }
        Scanner scanner = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.print("����һ��1-20֮������� ");
            int guessNumber = scanner.nextInt();

            for (int i = 0; i < data.length; i++) {
                if (data[i] == guessNumber) {
                    System.out.println("��,����Ϊ��" + i);
                    break OUT;
                }
            }
        }
        for (int d : data) {
            System.out.print(d + "\t");
        }
    }
}
