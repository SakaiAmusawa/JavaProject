package Test.TestException;

import java.util.Scanner;

public class TestException02 {
    public static void main(String[] args) {
        int x;
        int y;
        int result = 0;

        System.out.println("请输入两个相除的整数");
        Scanner scanner = new Scanner(System.in);

        System.out.println("被除数：");
        x = scanner.nextInt();
        System.out.println("除数：");
        y = scanner.nextInt();
        try {
            result = x / y;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("发生异常！！！");
        }
        //使用try{} catch(Exception e){} 结构处理异常
        System.out.println("结果为：" + result);


    }
}
