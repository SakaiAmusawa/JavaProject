package BuyAirTicket;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������Ʊ�ۣ�");
        double fare = scanner.nextDouble();
        System.out.print("�������·ݣ�");
        int month = scanner.nextInt();
        System.out.print("��������λ�ȼ���");
        int seat = scanner.nextInt();

        System.out.println(airTicket(fare, month, seat));


    }

    public static double airTicket(double fare, int month, int seat) {
        if (month >= 5 && month <= 10) {
            switch (seat) {
                case 1 -> fare *= 0.9;
                case 2 -> fare *= 0.85;
                default -> System.out.println("�����λ����");
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            switch (seat) {
                case 1 -> fare *= 0.7;
                case 2 -> fare *= 0.65;
                default -> System.out.println("�����λ����");
            }

        } else {
            System.out.println("�����·�����");
        }
        return fare;
    }
}
