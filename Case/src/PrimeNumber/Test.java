package PrimeNumber;

//��101-200֮�������
public class Test {
    public static void main(String[] args) {
        for (int i = 101; i < 200; i++) {

            //�ź�λ:���
            boolean flag = true;//һ��ʼ��Ϊ��ǰ����������

            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "\t");
            }
        }

    }
}
