package Test.spoils;

import java.util.Random;

public class Spoils {
    Random random = new Random();
    private int x = random.nextInt(600);
    private int y = random.nextInt(600);
    private String Url = "img/spoils.jpg";

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

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
