package com.Case02;

public class Tank {

    String name = "T-34";
    int speed = 10;
    int x = 100;
    int y = 100;
    private int life = 100;

    public void showTankInfo() {
        System.out.println("̹�˵����֣�" + name);
        System.out.println("̹�˵�����ֵ:" + life);
        System.out.println("̹�˵��ٶȣ�" + speed);
        System.out.println("̹�˵�λ�ã�" + x + "," + y);
    }

    public void move() {
        System.out.println("�ƶ�");
    }

    public void fire() {
        System.out.println("�����ڵ�");
    }

    public int getLife() {
        return life;
    }

    public void reduceLife() {
        life = life - 10;
    }
}


