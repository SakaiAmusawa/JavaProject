package zjw.loop.For;
//ˮ?ɻ???????
public class FotTest_narcissisticNumber {
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
