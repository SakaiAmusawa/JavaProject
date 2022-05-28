package zjw.loop.While;

public class WhileTest_01 {
    public static void main(String[] args) {
        //珠峰高度8848860 纸张厚度0.1 折叠纸张不低于珠峰
        double peakHeight = 8848860;
        double paperThickness = 0.1;

        int count = 0;
        while (paperThickness < peakHeight) {
            paperThickness *= 2;
            count++;
        }
        System.out.println("折叠次数:" + count);
        System.out.println("纸张高度:" + paperThickness);
    }
}
