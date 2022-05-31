package zjw.Array.Demo;

//掌握差，需要练习
public class ArrayTraverseDemo_BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1};
        //定义一个循环控制比较轮数 冒泡排序法需要的轮数为数组长度-1
        for (int i = 0; i < array.length - 1; i++) {
            //i==0 比较的次数3 占位 j=0 1 2
            //i==1 比较的次数2 占位 j=0 1
            //i==2 比较的次数1 占位 j=0

            //定义一个循环，控制每轮循环的次数以及占位
            for (int j = 0; j < array.length - i - 1; j++) {
                //判断j当前位置的元素值 是否大于后一个位置 若大 则交换
                if (array[j] > array[j + 1]) {
                    int temporary = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temporary;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
