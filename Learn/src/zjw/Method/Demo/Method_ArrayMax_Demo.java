package zjw.Method.Demo;

public class Method_ArrayMax_Demo {

    public static void main(String[] args) {
        int[] age = {5, 9, 12, 60, 45};
        Max(age);
    }

    public static void Max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("最大值为："+max);

    }
}
