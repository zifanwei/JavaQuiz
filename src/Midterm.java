import java.util.ArrayList;
import java.util.Arrays;

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

    static class NodeMid {
        int element;
        NodeMid next;

        NodeMid(int element) {
            this.element = element;
        }
    }

    // 方法：交换链表中每一对相邻节点的数据
    public static void exchange(NodeMid list) {
        if (list == null || list.next == null) {
            return;
        }

        NodeMid p = list;
        NodeMid q = list.next;

        while (q != null) {
            // 交换 p.element 和 q.element
            int temp = p.element;
            p.element = q.element;
            q.element = temp;

            // 跳到下一个 pair
            p = q.next;
            if (p == null) break;
            q = p.next;
        }
    }

    // 打印链表
    public static void printList(NodeMid head) {
        NodeMid cur = head;
        while (cur != null) {
            System.out.print(cur.element + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void findRepeatedIntegers(int[] B) {
        Arrays.sort(B);
        int count = 0;
        ArrayList<Integer> repeated = new ArrayList<>();

        for (int i = 0; i < B.length - 1; i++) {
            if (count == 5) {
                break;
            }
            if (B[i] == B[i + 1]) {
                if (repeated.contains(B[i])) {
                    count++;
                } else {
                    count += 2;
                    repeated.add(B[i]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeated.size(); i++) {
            sb.append(repeated.get(i));
            if (i < repeated.size() - 1) sb.append(",");
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) {
        // Q2
        silly(5);
        silly2(6);

        // Q3
        int[] A = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        calculate(A, sum);

        // Q5
        // 构建链表 1 → 2 → 3 → 4 → 5 → 6 → 7
        NodeMid head = new NodeMid(1);
        head.next = new NodeMid(2);
        head.next.next = new NodeMid(3);
        head.next.next.next = new NodeMid(4);
        head.next.next.next.next = new NodeMid(5);
        head.next.next.next.next.next = new NodeMid(6);
        head.next.next.next.next.next.next = new NodeMid(7);

        System.out.println("Before exchange:");
        printList(head);

        exchange(head);

        System.out.println("After exchange:");
        printList(head);

        //Q6
        int[] B = {1,2,3,1,3,1};

        findRepeatedIntegers(B);
    }
}
