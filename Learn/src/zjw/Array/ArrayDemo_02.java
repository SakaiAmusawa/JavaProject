package zjw.Array;

public class ArrayDemo_02 {
    public static void main(String[] args) {
        //静态数组方法
        double[] array = new double[3];
        array[0] = 95.5;
        System.out.println(array[0]);
        //数组中 byte short char long double int 默认值为0
        //数组中 double float 默认值为0.0
        System.out.println(array[1]);

        String[] S_array = new String[3];
        S_array[0] = "zjw";
        System.out.println(S_array[0]);
        //数组中 String 默认值为null
        System.out.println(S_array[1]);

        //数组中 boolean 默认值为false
    }
}
