package zjw.Method.param;
//���ô���
public class MethodParam02 {
    public static void main(String[] args) {
        int[] array={10,20,30};
        change(array);
        System.out.println(array[1]);//40
    }
    public static void change(int[] array){
        System.out.println(array[1]);//20
        array[1]=40;
        System.out.println(array[1]);//40
    }
    /*��һ������һ�����飬array����һ����ַ
    �ڶ�������change��������ʱ������ĵ�ַ���ݸ��βζ�����ֵ
    ���array[1]Ϊ20����array[1]��Ϊ40
    ���array[1]Ϊ40
    ������ڵ�ַ��ֵ�����˸ı�������������array[1]Ϊ�ı��ֵ40*/
}
