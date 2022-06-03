package DigitalEncryption;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("明码长度：");
        int length = scanner.nextInt();
        int[] codeArray = new int[length];
        intPut_Array(codeArray);
        encryption(codeArray);
    }

    public static void encryption(int[] array) {
        System.out.print("暗码为：");
        int[] first = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            first[i] = array[i] + 5;
        }

        int[] second = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            second[i] = first[i] % 10;
        }

        int[] third = new int[second.length];
        for (int i = 0; i < second.length; i++) {
            third[i] = second[second.length - (i + 1)];
            System.out.print(third[i]);
        }
    }

    public static void intPut_Array(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位数：");
            int code = scanner.nextInt();
            array[i] = code;
        }
    }
}
