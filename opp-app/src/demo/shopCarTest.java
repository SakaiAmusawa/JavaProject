package demo;

import java.util.Scanner;

public class shopCarTest {
    public static void main(String[] args) {
        //���幺�ﳵ����ʹ��һ����������ʾ

        Goods[] shopCar = new Goods[100];
        
        //������ܹ�

        System.out.println("ѡ������");
        System.out.println("�����Ʒ�����ﳵ��add");
        System.out.println("�鿴���ﳵ��query");
        System.out.println("�޸Ĺ��ﳵ��update");
        System.out.println("���㹺�ﳵ��pay");

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
