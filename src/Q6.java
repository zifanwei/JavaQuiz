/**
 * 构建循环 DLL - 时间复杂度为 O(n)，空间复杂度为 O(1)
 * 其思路是通过将链表的尾部连接到头部来使其成为一个循环。然后，我们将头部和尾部指针向前移动 p 个位置，最后断开循环链接，利用新的头部和尾部恢复链表的原始结构。这种方法通过调整链接来高效地旋转链表，而无需重新排列节点数据。
 *
 * 请按照以下步骤解决问题：
 *
 * 将最后一个节点的下一个指针指向头部，并将头部的上一个指针指向尾部。
 * 按p 个位置遍历列表，将头部移动到新位置，并相应地调整尾部。
 * 将新尾节点的下一个指针设置为null，将新头节点的上一个指针设置为null。
 * 旋转后，新的头部现在位于所需位置。
 */

// Java program to rotate a doubly-linked
// list counter-clockwise by p positions


class Q6 {

    // Function to rotate the doubly-linked list
    static DoubleNode rotateDLL(DoubleNode head, int p) {
        DoubleNode tail = head;

        // Find the last node
        while (tail.next != null) {
            tail = tail.next;
        }

        // Make the list circular
        tail.next = head;
        head.prev = tail;

        // Move head and tail by the given position
        for (int count = 1; count <= p; count++) {
            head = head.next;
            tail = tail.next;
        }

        // Break the circular connection
        tail.next = null;
        head.prev = null;

        return head;
    }

    static void printList(DoubleNode head) {
        DoubleNode curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoubleNode head = new DoubleNode(2);
        head.next = new DoubleNode(6);
        head.next.prev = head;
        head.next.next = new DoubleNode(5);
        head.next.next.prev = head.next;
        head.next.next.next = new DoubleNode(4);
        head.next.next.next.prev = head.next.next;

        int p = 3;
        head = rotateDLL(head, p);
        printList(head);
    }
}