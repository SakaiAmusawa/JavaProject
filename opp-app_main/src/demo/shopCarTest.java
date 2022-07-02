package demo;

import java.util.Scanner;

public class shopCarTest {
    public static void main(String[] args) {
        //���幺�ﳵ����ʹ��һ����������ʾ

        Goods[] shopCar = new Goods[100];

        //������ܹ�
        OUT:
        while (true) {
            System.out.println("ѡ������");
            System.out.println("�����Ʒ�����ﳵ��add");
            System.out.println("�鿴���ﳵ��query");
            System.out.println("�޸Ĺ��ﳵ��update");
            System.out.println("���㹺�ﳵ��pay");
            System.out.println("�˳�����quit");

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
                    System.out.println("�����˳�");
                    break OUT;
                default:
                    System.out.println("stop idiot");
                    break;
            }
        }
    }

    private static void add(Goods[] shopCar, Scanner scanner) {
        System.out.println("����ID");
        int id = scanner.nextInt();
        System.out.println("������Ʒ��");
        String name = scanner.next();
        System.out.println("������Ʒ����");
        int buyNumber = scanner.nextInt();
        System.out.println("������Ʒ�۸�");
        double price = scanner.nextDouble();

        //����Щ��Ʒ��Ϣ��װ��һ����Ʒ����
        Goods goods = new Goods();
        goods.id = id;
        goods.name = name;
        goods.buyNumber = buyNumber;
        goods.price = price;

        //��ӵ�������ȥ
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = goods;
                break;
            }
        }
        System.out.println(goods.name + "�����");
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
            System.out.println("��Ҫ���ĵ���ƷID��");
            int id = scanner.nextInt();
            Goods goods = getID(id, shopCar);
            if (goods == null) {
                System.out.println("����");
            } else {
                System.out.println("����" + goods.name + "������������");
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
        System.out.println("�ܼ�" + money);
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
