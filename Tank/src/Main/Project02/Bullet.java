package Main.Project02;

import java.awt.*;

public class Bullet implements Runnable {

    private int x;
    private int y;
    private int speed = 5;
    private MyPanel myPanel;

    public Bullet(int x ,int y, MyPanel myPanel){
        this.x=x;
        this.y=y;
        this.myPanel=myPanel;
    }

    public void draw(Graphics g){
        g.setColor(Color.RED);
        //x+15,y-15调整炮弹射出位置
        g.fillOval(x+15,y-15,20,20);
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(30);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            this.y=this.y-speed;
            myPanel.repaint();
        }
    }
}
