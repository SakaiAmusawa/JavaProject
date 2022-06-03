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
        //ǰ�����������
        for (int i = 0; i < bingo.length - 1; i++) {
            //��ɫ����벻���ظ�
            while (true) {
                //���ú�ɫ��������Χ
                int data = random.nextInt(33) + 1;

                //����һ�����λ
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (bingo[j] == data) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    //data֮ǰû�г��ֹ�
                    bingo[i] = data;
                    break;
                }
            }
        }
        bingo[bingo.length - 1] = random.nextInt(16) + 1;

        //���ף��鿴�н�����
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
            System.out.print("�����" + (i + 1) + "���������:");
            int data = scanner.nextInt();
            user[i] = data;
        }
        System.out.print("����������룺");
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
        System.out.println("���к���" + red_bingo + "��");
        System.out.println("��������" + (blue_bingo == 1 ? "��" : "��"));


        if (blue_bingo == 1 && red_bingo < 3) {
            System.out.println("��5");
        } else if (blue_bingo == 1 && red_bingo == 3 || blue_bingo == 0 && red_bingo == 4) {
            System.out.println("��10");
        } else if (blue_bingo == 1 && red_bingo == 4 || blue_bingo == 0 && red_bingo == 5) {
            System.out.println("��200");

        } else if (blue_bingo == 1 && red_bingo == 5) {
            System.out.println("��3000");
        } else if (blue_bingo == 0 && red_bingo == 6) {
            System.out.println("��500w");
        } else if (blue_bingo == 1 && red_bingo == 6) {
            System.out.println("��1000w");
        }else {
            System.out.println("δ�н�");
        }
    }
}
