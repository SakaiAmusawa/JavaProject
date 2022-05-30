package zjw.Array.Demo;

import java.util.Random;
import java.util.Scanner;

public class ArrayTraverseDemo_ID {
    //目的：键盘输入一组工号，最终随机输出一组作为排名

    public static void main(String[] args) {
        int[] Id = new int[5];

        //输入员工的工号
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Id.length; i++) {
            System.out.print("请输入第" + (i + 1) + "员工的工号:");
            int id = scanner.nextInt();
            Id[i] = id;
        }

        //遍历数组中的每个元素，然后随机一个索引出来，让该元素与随机索引位置处的元素值进行交换
        Random random = new Random();
        for (int i = 0; i < Id.length; i++) {
            //随机一个索引位置出来 Id[index]
            int index = random.nextInt(Id.length);

            int temp = Id[index];//定义一个临时变量储存index位置处的值
            Id[index] = Id[i];   //让index索引处的值等于i处的值
            Id[i] = temp;        //再让i处的值等于原来index的值保留数据的完整性，如果不替换就会出现重复的数值
        }
        for (int i : Id) {
            System.out.print(i + "\t");
        }
    }

}
