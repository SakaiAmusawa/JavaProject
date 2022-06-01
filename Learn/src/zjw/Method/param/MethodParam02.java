package zjw.Method.param;
//引用传递
public class MethodParam02 {
    public static void main(String[] args) {
        int[] array={10,20,30};
        change(array);
        System.out.println(array[1]);//40
    }
    public static void change(int[] array){
        System.out.println(array[1]);//20
        array[1]=40;
        System.out.println(array[1]);//40
    }
    /*第一步创建一个数组，array储存一个地址
    第二步调用change方法，此时将储存的地址传递给形参而不是值
    输出array[1]为20，将array[1]改为40
    输出array[1]为40
    最后由于地址内值发生了改变所以最后输出的array[1]为改变的值40*/
}
