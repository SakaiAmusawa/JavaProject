package BuyAirTicket;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入票价：");
        double fare = scanner.nextDouble();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.print("请输入座位等级：");
        int seat = scanner.nextInt();

        System.out.println(airTicket(fare, month, seat));


    }

    public static double airTicket(double fare, int month, int seat) {
        if (month >= 5 && month <= 10) {
            switch (seat) {
                case 1 -> fare *= 0.9;
                case 2 -> fare *= 0.85;
                default -> System.out.println("输入仓位有误");
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            switch (seat) {
                case 1 -> fare *= 0.7;
                case 2 -> fare *= 0.65;
                default -> System.out.println("输入仓位有误");
            }

        } else {
            System.out.println("输入月份有误");
        }
        return fare;
    }
}
