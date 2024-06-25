class SinglyLinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the front of the list
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Method to display the list in reverse order using recursion
    public void displayReverse(Node node) {
        if (node == null) {
            return;
        }
        displayReverse(node.next);
        System.out.print(node.data + " ");
    }

    public void displayReverse() {
        displayReverse(head);
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Adding nodes to the list
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        // Display the list in reverse order
        list.displayReverse(); // Output: 10 20 30 40
    }
}
