package zjw.Method.Demo;

import java.util.Scanner;

public class Method_ArrayMax_myself {

    public static void main(String[] args) {
        Max();
    }

    public static void Max() {
        Scanner scanner = new Scanner(System.in);

        //��������ĳ���
        System.out.println("�������ַ������ȣ�");
        int length = scanner.nextInt();
        int[] array = new int[length];

        //Ϊ���鸳ֵ
        for (int i = 0; i < array.length; i++) {
            System.out.println("�������" + (i + 1) + "������");
            int number = scanner.nextInt();
            array[i] = number;
        }

        //����ѭ�����飬ͨ���Ƚ�������ֵ
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("���ֵΪ��" + max);

    }
}
