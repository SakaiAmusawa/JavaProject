package two_colorBall;

import java.util.Random;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        int[] Bingo = BingoNumber();
        int[] Use = UseNumber();
        judge(Use, Bingo);
    }

    public static int[] BingoNumber() {
        int[] bingo_number = new int[7];
        Random random = new Random();

        for (int i = 0; i < bingo_number.length - 1; i++) {
            while (true) {
                int data = random.nextInt(33) + 1;
                boolean flag = true;

                for (int j = 0; j < i; j++) {
                    if (bingo_number[j] == data) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    bingo_number[i] = data;
                    break;
                }

            }

        }

        bingo_number[bingo_number.length - 1] = random.nextInt(16) + 1;

        return bingo_number;
    }

    public static int[] UseNumber() {
        int[] use_number = new int[7];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < use_number.length - 1; i++) {
            System.out.println("第" + (i+1) + "个红球为：");
            int data = scanner.nextInt();
            use_number[i] = data;
        }
        System.out.println("蓝球为：");
        use_number[use_number.length - 1] = scanner.nextInt();
        return use_number;
    }

    public static void judge(int[] user, int[] bingo) {
        int red = 0;
        int blue;
        for (int i = 0; i < user.length - 1; i++) {
            for (int j = 0; j < bingo.length - 1; j++) {
                if (bingo[j] == user[i]) {
                    red++;
                    break;
                }
            }
        }
        blue = user[user.length - 1] == bingo[bingo.length - 1] ? 1 : 0;
        System.out.print("bingo:");
        for (int j : bingo) {
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.print("user:");
        for (int i : user) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("猜中红球：" + red + "个");
        System.out.println("猜中蓝球：" + (blue == 1 ? "是" : "否"));


        if (blue == 1 && red < 3) {
            System.out.println("中5");
        } else if (blue == 1 && red == 3 || blue == 0 && red == 4) {
            System.out.println("中10");
        } else if (blue == 1 && red == 4 || blue == 0 && red == 5) {
            System.out.println("中200");

        } else if (blue == 1 && red == 5) {
            System.out.println("中3000");
        } else if (blue == 0 && red == 6) {
            System.out.println("中500w");
        } else if (blue == 1 && red == 6) {
            System.out.println("中1000w");
        } else {
            System.out.println("未中奖");
        }
    }

}
