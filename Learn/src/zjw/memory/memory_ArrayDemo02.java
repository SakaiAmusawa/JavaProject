package zjw.memory;

public class memory_ArrayDemo02 {
    public static void main(String[] args) {
        //Ŀ�꣺���2���������ָ��һ���������
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;

        //��ַ��ͬ
        System.out.println(arr1);
        System.out.println(arr2);

        //�ı�arr2 arr1��ֵҲ�����˱仯
        arr2[1] = 99;
        System.out.println(arr2[1]);

        System.out.println(arr1[1]);
    }
}
