package zjw.Method.param;

import java.util.Scanner;

public class MethodParamDemo_ReturnIndex {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(returnIndex(array, 30));
        System.out.println(returnIndex(array, 40));
    }

    public static int returnIndex(int[] array, int data) {

        for (int i = 0; i < array.length; i++) {
            if (data == array[i]) {
                return i;
            }
        }

        return -1;
    }
}
