package zjw.Array.Demo;

//���ղ��Ҫ��ϰ
public class ArrayTraverseDemo_BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1};
        //����һ��ѭ�����ƱȽ����� ð��������Ҫ������Ϊ���鳤��-1
        for (int i = 0; i < array.length - 1; i++) {
            //i==0 �ȽϵĴ���3 ռλ j=0 1 2
            //i==1 �ȽϵĴ���2 ռλ j=0 1
            //i==2 �ȽϵĴ���1 ռλ j=0

            //����һ��ѭ��������ÿ��ѭ���Ĵ����Լ�ռλ
            for (int j = 0; j < array.length - i - 1; j++) {
                //�ж�j��ǰλ�õ�Ԫ��ֵ �Ƿ���ں�һ��λ�� ���� �򽻻�
                if (array[j] > array[j + 1]) {
                    int temporary = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temporary;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
