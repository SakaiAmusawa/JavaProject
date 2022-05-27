package zjw.Array;

public class ArrayDemo_01 {
    public static void main(String[] args) {

//        double[] scores = new double[]{99.5, 88.0, 75.5};
        double[] scores = {99.5, 88.0, 75.5};

//        int[] ages = new int[]{12, 24, 36};
        int[] ages = {12, 24, 36};

//        String[] names = new String[]{"a", "b", "c"};
        String[] names = {"a", "b", "c"};

        System.out.println(names[0]);

        names[0] = "z";
        System.out.println(names[0]);

        System.out.println("---------------------------------------------");
        //数组的长度
        System.out.println(names.length);

        //数组的最大索引
        System.out.println(names.length - 1);
    }
}
