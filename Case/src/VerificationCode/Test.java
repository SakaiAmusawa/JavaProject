package VerificationCode;

import java.util.Random;

//������֤��
public class Test {
    public static void main(String[] args) {
        System.out.println(code(5));

    }

    public static String code(int n) {
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            //����һ������ַ���Ӣ�Ĵ�д Сд ���� �� 0 1 2 ����
            int type = random.nextInt(3);
            switch (type) {
                //��д�ַ���A65-Z90�� (0-25)+65
                case 0 -> {
                    char ch = (char) (random.nextInt(26) + 65);
                    code.append(ch);
                }
                //��д�ַ���A97-Z122�� (0-25)+97
                case 1 -> {
                    char ch1 = (char) (random.nextInt(26) + 97);
                    code.append(ch1);
                }
                case 2 -> code.append(random.nextInt(10));

            }
        }


        return code.toString();
    }
}
