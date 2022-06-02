import java.util.Scanner;

public class MakeScore {
    public static void main(String[] args) {
        int[] scores = new int[6];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("第" + (i+1) + "个评委的打分：");
            int score = scanner.nextInt();
            scores[i] = score;
        }
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
            sum += score;
        }
        double result = (sum - max - min) * 1.0 / (scores.length - 2);
        System.out.println(result);
    }
}
