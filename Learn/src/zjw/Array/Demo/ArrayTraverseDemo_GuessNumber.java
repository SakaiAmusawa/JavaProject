package zjw.Array.Demo;

import java.util.Random;
import java.util.Scanner;

public class ArrayTraverseDemo_GuessNumber {
    public static void main(String[] args) {
        //需求：5个1-20之间的随机数，让用户猜，猜中提示，输出该数据在数组中第一次出现的索引，最后打印数组的内容出来
        //没有猜中则继续
        Random random = new Random();
        int[] data = new int[5];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(20) + 1;
        }
        Scanner scanner = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.print("输入一个1-20之间的数： ");
            int guessNumber = scanner.nextInt();

            for (int i = 0; i < data.length; i++) {
                if (data[i] == guessNumber) {
                    System.out.println("中,索引为：" + i);
                    break OUT;
                }
            }
        }
        for (int d : data) {
            System.out.print(d + "\t");
        }
    }
}
