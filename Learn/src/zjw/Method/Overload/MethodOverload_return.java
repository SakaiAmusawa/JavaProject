package zjw.Method.Overload;

public class MethodOverload_return {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        chu(a, b);

    }

    public static void chu(int a, int b) {
        if (b == 0) {
            System.out.println("fuck");
            return;
        }
        int c = a / b;
        System.out.println(c);
    }
}
