package Student;

//理解两个变量指向同一个对象的内存运行机制

public class Student {
    String name;
    char sex;
    String hobby;

    public void study() {
        System.out.println(name + "\t" + sex + "\t" + hobby);
    }
}
