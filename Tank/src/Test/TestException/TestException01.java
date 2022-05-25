package Test.TestException;

import java.util.Scanner;

public class TestException01 {
    public static void main(String[] args) {
        int x;
        int y;
        int result;

        System.out.println("请输入两个相除的整数");
        Scanner scanner = new Scanner(System.in);

        System.out.println("被除数：");
        x = scanner.nextInt();
        System.out.println("除数：");
        y = scanner.nextInt();
        result = x / y;

        System.out.println("结果为：" + result);

        /*
        * 当除数为0时程序终止
        * 原因：遇到异常
        */
    }
}
