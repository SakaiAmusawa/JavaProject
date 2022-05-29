package zjw.loop.Demo;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        //for循环5次，但是在第3次停止循环
        for (int i = 1; i < 5; i++) {
            System.out.println("a dog?");
            if (i == 3) {
                break;
            }
        }
        //for循环5次，但是跳过了第三次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("a dog" + i);
        }

    }
}
