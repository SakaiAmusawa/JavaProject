package zjw.loop.Demo;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        //forѭ��5�Σ������ڵ�3��ֹͣѭ��
        for (int i = 1; i < 5; i++) {
            System.out.println("a dog?");
            if (i == 3) {
                break;
            }
        }
        //forѭ��5�Σ����������˵�����ѭ��
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("a dog" + i);
        }

    }
}
