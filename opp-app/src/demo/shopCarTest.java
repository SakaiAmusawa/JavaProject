package demo;

import java.util.Scanner;

public class shopCarTest {
    public static void main(String[] args) {
        //定义购物车对象：使用一个数组对象表示

        Goods[] shopCar = new Goods[100];
        
        //搭建操作架构

        System.out.println("选择命令");
        System.out.println("添加商品到购物车：add");
        System.out.println("查看购物车：query");
        System.out.println("修改购物车：update");
        System.out.println("结算购物车：pay");

        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        
        switch (command){
            case "add":
                add(shopCar);
                break;
            case "query":
                query(shopCar);
                break;
            case "update":
                update(shopCar);
            case "pay":
                pay(shopCar);
        }
    }

    private static void query(Goods[] shopCar) {
    }

    private static void update(Goods[] shopCar) {
        
    }

    private static void pay(Goods[] shopCar) {
        
    }

    private static void add(Goods[] shopCar) {
    }
}
