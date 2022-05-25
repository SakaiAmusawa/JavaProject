package Test.Case_01;

public class Tank {
    String name = "T-34";
    int life = 100;
    int speed = 10;

    int x = 100;
    int y = 100;

    public void showTankInfo() {
        System.out.println("坦克的名字：" + name);
        System.out.println("坦克的生命值:" + life);
        System.out.println("坦克的速度：" + speed);
        System.out.println("坦克的位置：" + x + "," + y);
    }

    public void move() {
        System.out.println("移动");
    }

    public void fire() {
        System.out.println("发射炮弹");
    }
}
