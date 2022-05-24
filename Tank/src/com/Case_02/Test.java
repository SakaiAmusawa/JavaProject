package com.Case_02;

public class Test {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.showTankInfo();

        tank.reduceLife();
        tank.showTankInfo();
    }
}
