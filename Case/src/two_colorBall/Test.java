package two_colorBall;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] Bingo_array = Bingo_roll();
        int[] User_array = User_roll();
        judge(Bingo_array, User_array);

    }

    public static int[] Bingo_roll() {
        int[] bingo = new int[7];
        Random random = new Random();
        //前六个红球号码
        for (int i = 0; i < bingo.length - 1; i++) {
            //红色球号码不得重复
            while (true) {
                //设置红色球的随机范围
                int data = random.nextInt(33) + 1;

                //定义一个标记位
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (bingo[j] == data) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    //data之前没有出现过
                    bingo[i] = data;
                    break;
                }
            }
        }
        bingo[bingo.length - 1] = random.nextInt(16) + 1;

        //作弊：查看中奖号码
        for (int j : bingo) {
            System.out.print(j + "\t");
        }
        System.out.println(" ");
        return bingo;
    }

    public static int[] User_roll() {
        int[] user = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < user.length - 1; i++) {
            System.out.print("输入第" + (i + 1) + "个红球号码:");
            int data = scanner.nextInt();
            user[i] = data;
        }
        System.out.print("输入蓝球号码：");
        user[6] = scanner.nextInt();

        return user;
    }

    public static void judge(int[] bingo, int[] user) {
        int red_bingo = 0;
        int blue_bingo;

        for (int i = 0; i < user.length - 1; i++) {
            for (int j = 0; j < bingo.length - 1; j++) {
                if (user[i] == bingo[j]) {
                    red_bingo++;
                    break;
                }
            }
        }
        blue_bingo = user[6] == bingo[6] ? 1 : 0;
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
        System.out.println("猜中红球：" + red_bingo + "个");
        System.out.println("猜中蓝球：" + (blue_bingo == 1 ? "是" : "否"));


        if (blue_bingo == 1 && red_bingo < 3) {
            System.out.println("中5");
        } else if (blue_bingo == 1 && red_bingo == 3 || blue_bingo == 0 && red_bingo == 4) {
            System.out.println("中10");
        } else if (blue_bingo == 1 && red_bingo == 4 || blue_bingo == 0 && red_bingo == 5) {
            System.out.println("中200");

        } else if (blue_bingo == 1 && red_bingo == 5) {
            System.out.println("中3000");
        } else if (blue_bingo == 0 && red_bingo == 6) {
            System.out.println("中500w");
        } else if (blue_bingo == 1 && red_bingo == 6) {
            System.out.println("中1000w");
        }else {
            System.out.println("未中奖");
        }
    }
}
