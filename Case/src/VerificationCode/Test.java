package VerificationCode;

import java.util.Random;

//生成验证吗
public class Test {
    public static void main(String[] args) {
        System.out.println(code(5));

    }

    public static String code(int n) {
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            //生成一个随机字符：英文大写 小写 数字 用 0 1 2 代表
            int type = random.nextInt(3);
            switch (type) {
                //大写字符（A65-Z90） (0-25)+65
                case 0 -> {
                    char ch = (char) (random.nextInt(26) + 65);
                    code.append(ch);
                }
                //大写字符（A97-Z122） (0-25)+97
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
