package Student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "zjw";
        student1.sex = '��';
        student1.hobby = "sleep";
        student1.study();

        Student student2 = student1;

        System.out.println(student1);
        System.out.println(student2);//�鿴��ַ

        student2.name = "wjz";

        System.out.println(student1.name);//student1��name�Ѿ�ͨ��s2�޸�
        System.out.println(student2.sex);
        System.out.println(student2.hobby);
        student2.study();

    }
}
