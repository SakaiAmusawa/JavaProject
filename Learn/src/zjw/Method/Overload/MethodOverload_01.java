package zjw.Method.Overload;

//方法重载的形式 调用流程 最后知道使用方法重载的好处
public class MethodOverload_01 {
    public static void main(String[] args) {
        fire();
        fire("somewhere");
        fire("somewhere", 2);
    }

    public static void fire() {
//        System.out.println("默认发射1枚导弹");
        fire("anywhere");
    }

    public static void fire(String location) {
//        System.out.println("发射1枚给" + location);
        fire(location, 1);
    }

    public static void fire(String location, int num) {
        System.out.println("发射" + num + "枚给" + location);
    }
}
