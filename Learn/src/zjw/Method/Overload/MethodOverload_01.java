package zjw.Method.Overload;

//�������ص���ʽ �������� ���֪��ʹ�÷������صĺô�
public class MethodOverload_01 {
    public static void main(String[] args) {
        fire();
        fire("somewhere");
        fire("somewhere", 2);
    }

    public static void fire() {
//        System.out.println("Ĭ�Ϸ���1ö����");
        fire("anywhere");
    }

    public static void fire(String location) {
//        System.out.println("����1ö��" + location);
        fire(location, 1);
    }

    public static void fire(String location, int num) {
        System.out.println("����" + num + "ö��" + location);
    }
}
