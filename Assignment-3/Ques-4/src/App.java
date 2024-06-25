class SortedLinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a new value in sorted order
    public void sortedInsert(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to print the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        // Inserting values in sorted order
        list.sortedInsert(30);
        list.sortedInsert(10);
        list.sortedInsert(50);
        list.sortedInsert(20);
        list.sortedInsert(40);

        // Display the sorted linked list
        list.display(); // Output: 10 20 30 40 50
    }
}
