package Test.TestException;

import java.util.Scanner;

public class TestException01 {
    public static void main(String[] args) {
        int x;
        int y;
        int result;

        System.out.println("�������������������");
        Scanner scanner = new Scanner(System.in);

        System.out.println("��������");
        x = scanner.nextInt();
        System.out.println("������");
        y = scanner.nextInt();
        result = x / y;

        System.out.println("���Ϊ��" + result);

        /*
        * ������Ϊ0ʱ������ֹ
        * ԭ�������쳣
        */
    }
}
