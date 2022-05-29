package zjw.Array;

import static java.lang.System.*;

public class ArrayDemo_01 {
    public static void main(String[] args) {

//        double[] scores = new double[]{99.5, 88.0, 75.5};
        double[] scores = {99.5, 88.0, 75.5};

//        int[] ages = new int[]{12, 24, 36};
        int[] ages = {12, 24, 36};

//        String[] names = new String[]{"a", "b", "c"};
        String[] names = {"a", "b", "c"};

        out.println(names[0]);

        names[0] = "z";
        out.println(names[0]);

        out.println("---------------------------------------------");
        //数组的长度
        out.println(scores.length);

        //数组的最大索引
        out.println(ages.length - 1);
    }
}
