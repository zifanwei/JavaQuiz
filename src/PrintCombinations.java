import java.util.ArrayList;
import java.util.Arrays;

public class PrintCombinations {

    public static void printCombination(int i, int n, int[] output, int index) {
        System.out.println("current i: " + i + ", n: " + n + ", output: " + Arrays.toString(output) + ", index: " + index);
        // if the sum becomes `n`, print the combination
        if (n == 0) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < index; j++) {
                list.add(output[j]);
            }
            System.out.println(list);
        }

        // start from the previous element in the combination till `n`
        for (int j = i; j <= n; j++) {
            // place current element at the current index
            output[index] = j;
            printCombination(j, n - j, output, index + 1);
        }

    }


    public static void main(String[] args) {
        int n = 5;
        int[] output = new int[n];
        printCombination(1, n, output, 0);
    }

}