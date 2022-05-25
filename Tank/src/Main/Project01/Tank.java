package Main.Project01;

public class Tank {
    private int x;
    private int y;
    private int speed = 5;
    private String Url = "img/tank.gif";

    public Tank(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public void moveL() {
        this.setUrl("img/p1tankL.gif");
        this.setX(this.getX() - getSpeed());
    }

    public void moveR() {
        this.setUrl("img/p1tankR.gif");
        this.setX(this.getX() + getSpeed());
    }

    public void moveU() {
        this.setUrl("img/p1tankU.gif");
        this.setY(this.getY() - getSpeed());
    }

    public void moveD() {
        this.setUrl("img/p1tankD.gif");
        this.setY(this.getY() + getSpeed());
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
}
