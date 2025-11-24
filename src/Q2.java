import java.util.Scanner;

public class Q2 { // Addition with User Input
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个整数: ");
        int num1 = scanner.nextInt();

        System.out.print("请输入第二个整数: ");
        int num2 = scanner.nextInt();

        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}
