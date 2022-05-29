package zjw.Array.Demo;

public class ArrayTraverseTest_max {
    public static void main(String[] args) {
        int[] faceScore = {15, 90, 100, 200, 95, -5};
        int max = faceScore[0];
        for (int i = 0; i < faceScore.length; i++) {
            if (faceScore[i] > max) {
                max = faceScore[i];
            }
        }
        System.out.println(max);
    }
}
