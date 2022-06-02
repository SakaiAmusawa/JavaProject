package PrimeNumber;

//找101-200之间的素数
public class Test {
    public static void main(String[] args) {
        for (int i = 101; i < 200; i++) {

            //信号位:标记
            boolean flag = true;//一开始认为当前数据是素数

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
