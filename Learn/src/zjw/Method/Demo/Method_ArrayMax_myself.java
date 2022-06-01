package zjw.Method.Demo;

import java.util.Scanner;

public class Method_ArrayMax_myself {

    public static void main(String[] args) {
        Max();
    }

    public static void Max() {
        Scanner scanner = new Scanner(System.in);

        //定义数组的长度
        System.out.println("请输入字符串长度：");
        int length = scanner.nextInt();
        int[] array = new int[length];

        //为数组赋值
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据");
            int number = scanner.nextInt();
            array[i] = number;
        }

        //遍历循环数组，通过比较输出最大值
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值为：" + max);

    }
}
