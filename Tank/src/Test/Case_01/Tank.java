package Test.Case_01;

public class Tank {
    String name = "T-34";
    int life = 100;
    int speed = 10;

    int x = 100;
    int y = 100;

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
}
