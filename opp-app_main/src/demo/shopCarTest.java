package demo;

import java.util.Scanner;

public class shopCarTest {
    public static void main(String[] args) {
        //定义购物车对象：使用一个数组对象表示

        Goods[] shopCar = new Goods[100];

        //搭建操作架构
        OUT:
        while (true) {
            System.out.println("选择命令");
            System.out.println("添加商品到购物车：add");
            System.out.println("查看购物车：query");
            System.out.println("修改购物车：update");
            System.out.println("结算购物车：pay");
            System.out.println("退出程序：quit");

            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();

            switch (command) {
                case "add":
                    add(shopCar, scanner);
                    break;
                case "query":
                    query(shopCar);
                    break;
                case "update":
                    update(shopCar, scanner);
                    break;
                case "pay":
                    pay(shopCar);
                    break;
                case "quit":
                    System.out.println("程序退出");
                    break OUT;
                default:
                    System.out.println("stop idiot");
                    break;
            }
        }
    }

    private static void add(Goods[] shopCar, Scanner scanner) {
        System.out.println("输入ID");
        int id = scanner.nextInt();
        System.out.println("输入商品名");
        String name = scanner.next();
        System.out.println("输入商品数量");
        int buyNumber = scanner.nextInt();
        System.out.println("输入商品价格");
        double price = scanner.nextDouble();

        //把这些商品信息封装成一个商品对象
        Goods goods = new Goods();
        goods.id = id;
        goods.name = name;
        goods.buyNumber = buyNumber;
        goods.price = price;

        //添加到数组中去
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = goods;
                break;
            }
        }
        System.out.println(goods.name + "已添加");
    }

    private static void query(Goods[] shopCar) {
        System.out.println("ID\t\t\tname\t\t\tprice\t\t\tnumber");
        for (int i = 0; i < shopCar.length; i++) {
            Goods goods =shopCar[i];
            if (goods != null) {
                System.out.println(goods.id + "\t\t\t" + goods.name + "\t\t\t" + goods.price + "\t\t\t" + goods.buyNumber);
            } else {
                break;
            }
        }
    }

    private static void update(Goods[] shopCar, Scanner scanner) {
        while (true) {
            System.out.println("需要更改的商品ID：");
            int id = scanner.nextInt();
            Goods goods = getID(id, shopCar);
            if (goods == null) {
                System.out.println("错误");
            } else {
                System.out.println("输入" + goods.name + "的最新数量：");
                goods.buyNumber = scanner.nextInt();
                query(shopCar);
                break;
            }
        }
    }

    private static void pay(Goods[] shopCar) {
        double money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods goods = shopCar[i];
            if (goods != null) {
                money += goods.price * goods.buyNumber;
            } else {
                break;
            }
        }
        System.out.println("总价" + money);
    }

    public static Goods getID(int id, Goods[] shopCar) {
        for (int i = 0; i < shopCar.length; i++) {
            Goods goods = shopCar[i];
            if (goods != null) {
                if (goods.id == id) {
                    return goods;
                }
            } else {
                return null;
            }

        }
        return null;

    }

}
