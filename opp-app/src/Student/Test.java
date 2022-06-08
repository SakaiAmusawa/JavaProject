package Student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "zjw";
        student1.sex = '男';
        student1.hobby = "sleep";
        student1.study();

        Student student2 = student1;

        System.out.println(student1);
        System.out.println(student2);//查看地址

        student2.name = "wjz";

        System.out.println(student1.name);//student1的name已经通过s2修改
        System.out.println(student2.sex);
        System.out.println(student2.hobby);
        student2.study();

    }
}
