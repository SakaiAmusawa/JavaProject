package zjw.loop;

import java.util.Scanner;

//死循环的正确用法
public class DeadForDemo {
    public static void main(String[] args) {
        int myPassword = 3016;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入密码:");
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
