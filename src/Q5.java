
class Q5 {

    // Function to reverse a circular linked list
    static Node reverseCircular(Node head) {
        // 0 or 1 node
        if (head == null || head.next == head) return head;

        Node prev = null;
        Node curr = head;
        Node nextNode = null;

        // Traverse until we complete one cycle
        do {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        } while (curr != head);

        // Fix the last connection to maintain circular property
        head.next = prev;
        head = prev;
        return head;
    }

    // Function to print circular linked list
    static void printList(Node head) {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Driver Code
    public static void main(String[] args) {
        // Create circular linked list: 1->2->3->4->1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head; // circular link

        System.out.print("Original Circular List: ");
        printList(head);

        head = reverseCircular(head);

        System.out.print("Reversed Circular List: ");
        printList(head);
    }
}