import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        // 运算符
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        // 2.获取键盘录入 个十百位 123
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);

    }
}
