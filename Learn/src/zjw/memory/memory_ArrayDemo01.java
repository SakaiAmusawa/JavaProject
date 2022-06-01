package zjw.memory;

public class memory_ArrayDemo01 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        int[] array = {11, 22, 33};
        for (int i : array) {
            System.out.println(i);
        }

        array[0] = 44;
        array[1] = 55;
        array[2] = 55;

        for (int i : array) {
            System.out.println(i);
        }
    }
}
