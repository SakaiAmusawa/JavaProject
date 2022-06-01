package zjw.Method;

public class MethodDemo_01 {
    public static void main(String[] args) {
        int Zhang = sum(10, 5);
        int Wang = sum(12, 3);
        System.out.println(Zhang);
        System.out.println(Wang);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
