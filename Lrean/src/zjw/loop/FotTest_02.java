package zjw.loop;
//水仙花数案例
public class FotTest_02 {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100;
            if (g * g * g + s * s * s + b * b * b == i) {
                System.out.println(i);
            }
        }

    }
}
