import java.util.Scanner;

public class Q3 { // Simple Calculator
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: 除数不能为0!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个整数: ");
        int num1 = scanner.nextInt();

        System.out.print("请输入第二个整数: ");
        int num2 = scanner.nextInt();

        System.out.print("请输入操作(add, subtract, multiply, divide): ");
        String operation = scanner.next();

        int result = 0;
        switch (operation.toLowerCase()) {
            case "add":
                result = add(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "subtract":
                result = subtract(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "multiply":
                result = multiply(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "divide":
                result = divide(num1, num2);
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("无效操作，请输入 add, subtract, multiply 或 divide");
        }
    }
}
