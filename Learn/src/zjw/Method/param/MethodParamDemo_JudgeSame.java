package zjw.Method.param;
//判断两个数组是否一样 类型 长度 素质
public class MethodParamDemo_JudgeSame {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {10,20,30};
        System.out.println(judge(arr1, arr2));

    }
    public static boolean judge(int[] array1,int[] array2){
        if (array1.length== array2.length){
            for (int i = 0; i < array1.length; i++) {
                if (array1[i]!=array2[i]){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
