package zjw.Array.Demo;

import java.util.Random;
import java.util.Scanner;

public class ArrayTraverseDemo_ID {
    //Ŀ�ģ���������һ�鹤�ţ�����������һ����Ϊ����

    public static void main(String[] args) {
        int[] Id = new int[5];

        //����Ա���Ĺ���
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Id.length; i++) {
            System.out.print("�������" + (i + 1) + "Ա���Ĺ���:");
            int id = scanner.nextInt();
            Id[i] = id;
        }

        //���������е�ÿ��Ԫ�أ�Ȼ�����һ�������������ø�Ԫ�����������λ�ô���Ԫ��ֵ���н���
        Random random = new Random();
        for (int i = 0; i < Id.length; i++) {
            //���һ������λ�ó��� Id[index]
            int index = random.nextInt(Id.length);

            int temp = Id[index];//����һ����ʱ��������indexλ�ô���ֵ
            Id[index] = Id[i];   //��index��������ֵ����i����ֵ
            Id[i] = temp;        //����i����ֵ����ԭ��index��ֵ�������ݵ������ԣ�������滻�ͻ�����ظ�����ֵ
        }
        for (int i : Id) {
            System.out.print(i + "\t");
        }
    }

}
