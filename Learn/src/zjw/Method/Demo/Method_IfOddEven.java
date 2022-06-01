package zjw.Method.Demo;

import java.util.Scanner;

public class Method_IfOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a number to judge it is oddNumber or evenNumber£º");
        int a = scanner.nextInt();
        OddEven(a);
    }

    public static void OddEven(int OE) {
        if (OE % 2 == 0) {
            System.out.println(OE + " is evenNumber");
        } else {
            System.out.println(OE + " is oddNumber");
        }
    }
}
