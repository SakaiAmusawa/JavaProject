package zjw.Method.param;

public class MethodParamDemo_PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
    /* *
    if (i < array.length - 1) {
                    System.out.print(array[i] + ",");
                } else if (i == array.length - 1) {
                    System.out.print(array[i]);
                }
    * */
                System.out.println(i == array.length - 1 ? array[i] : array[i] + ",");
            }
        }
        System.out.print("]");
    }
}
