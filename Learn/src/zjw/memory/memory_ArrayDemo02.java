package zjw.memory;

public class memory_ArrayDemo02 {
    public static void main(String[] args) {
        //目标：理解2个数组变量指向一个数组对象
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;

        //地址相同
        System.out.println(arr1);
        System.out.println(arr2);

        //改变arr2 arr1的值也发生了变化
        arr2[1] = 99;
        System.out.println(arr2[1]);

        System.out.println(arr1[1]);
    }
}
