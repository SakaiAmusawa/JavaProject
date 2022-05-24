package com.Case_01;

public class Test {
    public static void main(String[] args) {
        Tank tank = new Tank();

        System.out.println(tank.name);
        System.out.println(tank.life);

        tank.life = 50;
        System.out.println(tank.life);

        tank.move();
        tank.fire();
    }
}
