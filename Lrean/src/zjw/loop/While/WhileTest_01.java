package zjw.loop.While;

public class WhileTest_01 {
    public static void main(String[] args) {
        //���߶�8848860 ֽ�ź��0.1 �۵�ֽ�Ų��������
        double peakHeight = 8848860;
        double paperThickness = 0.1;

        int count = 0;
        while (paperThickness < peakHeight) {
            paperThickness *= 2;
            count++;
        }
        System.out.println("�۵�����:" + count);
        System.out.println("ֽ�Ÿ߶�:" + paperThickness);
    }
}
