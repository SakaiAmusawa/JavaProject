package Test.TestException;

import java.util.Scanner;

public class TestException02 {
    public static void main(String[] args) {
        int x;
        int y;
        int result = 0;

        System.out.println("�������������������");
        Scanner scanner = new Scanner(System.in);

        System.out.println("��������");
        x = scanner.nextInt();
        System.out.println("������");
        y = scanner.nextInt();
        try {
            result = x / y;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("�����쳣������");
        }
        //ʹ��try{} catch(Exception e){} �ṹ�����쳣
        System.out.println("���Ϊ��" + result);


    }
}
