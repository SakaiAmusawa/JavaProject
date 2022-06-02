package CopyArray;

public class Test {
    public static void main(String[] args) {
        int[] arrayMain = {11, 22, 33, 44};
        int[] arrayCopy = new int[arrayMain.length];
        copy(arrayMain, arrayCopy);
        printArray(arrayMain);
        printArray(arrayCopy);
    }

    public static void copy(int[] arrayMain, int[] arrayCopy) {
        for (int i = 0; i < arrayMain.length; i++) {
            arrayCopy[i] = arrayMain[i];
        }

    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i == array.length-1 ? array[i] : array[i] + ",");
        }
        System.out.println("]");
    }

}
