package zjw.loop;

import java.util.Scanner;

//��ѭ������ȷ�÷�
public class DeadForDemo {
    public static void main(String[] args) {
        int myPassword = 3016;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("����������:");
            int password = scanner.nextInt();
            if (password == myPassword) {
                System.out.println("true du");
                break;
            } else {
                System.out.println("error!!!");
            }
        }
    }
}
