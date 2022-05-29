package zjw.loop.Demo;

public class ForForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-----------");
            for (int j = 0; j < 5; j++) {
                System.out.println("is that a dog?");
            }
        }
        System.out.println("----------");
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();//起到换行作用
        }
    }
}
