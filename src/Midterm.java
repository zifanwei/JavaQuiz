public class Midterm {
    public static void silly(int n) {
        for (int i = 0; i < 1000; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < j; ++k)
                    System.out.println("k = " + k);
                for (int m = 0; m < i; ++m)
                    System.out.println("m = " + m);
            }
        }
    }

    public static void silly2(int n) {
        for (int j = 0; j < n; ++j) {
            j = 0;
            while (j < n) {
                System.out.println("j = " + j);
                j++;
            }
        }
    }

    public static void calculate(int[] A, int sum) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == sum) {
                    System.out.println(i + j);
                    return;
                }
            }
        }
    }


    public static void main(String[] args) {
        silly(5);
        silly2(6);
        int[] A = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        calculate(A, sum);
    }
}
