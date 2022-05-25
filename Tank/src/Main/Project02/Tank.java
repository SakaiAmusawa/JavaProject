package Main.Project02;

import javax.swing.*;
import java.awt.*;

public class Tank {
    private int x;
    private int y;
    private int speed = 5;
    private Bullet bullet = null;
    private MyPanel myPanel;
    private String Url = "img/p1tankU.gif";

    public Tank(int x, int y, MyPanel myPanel) {
        this.x = x;
        this.y = y;
        this.myPanel = myPanel;

    }

    public void draw(Graphics g) {
        ImageIcon imageIcon = new ImageIcon(Url);
        Image image = imageIcon.getImage();
        g.drawImage(image, x, y, 50, 50, null);
    }

    public void fire() {
        bullet = new Bullet(x, y, myPanel);
        new Thread(bullet).start();
    }

    public void moveL() {
        this.setUrl("img/p1tankL.gif");
        this.setX(this.getX() - getSpeed());
        myPanel.repaint();
    }

    public void moveR() {
        this.setUrl("img/p1tankR.gif");
        this.setX(this.getX() + getSpeed());
        myPanel.repaint();
    }

    public void moveU() {
        this.setUrl("img/p1tankU.gif");
        this.setY(this.getY() - getSpeed());
        myPanel.repaint();
    }

    public void moveD() {
        this.setUrl("img/p1tankD.gif");
        this.setY(this.getY() + getSpeed());
        myPanel.repaint();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
