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

    // Insert a new node after a given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Insert a new node before a given node
    public void insertBefore(Node nextNode, int data) {
        if (nextNode == null) {
            System.out.println("The given next node cannot be null");
            return;
        }

        Node newNode = new Node(data);

        if (head == nextNode) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node prev = null, curr = head;

        while (curr != null && curr != nextNode) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("The given next node is not present in the list");
            return;
        }

        prev.next = newNode;
        newNode.next = nextNode;
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

    // Method to add a new node at the front of the list
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Adding nodes to the list
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        list.display(); // Output: 40 30 20 10

        // Inserting a node after the second node (30)
        list.insertAfter(list.head.next, 25);
        list.display(); // Output: 40 30 25 20 10

        // Inserting a node before the second node (30)
        list.insertBefore(list.head.next, 35);
        list.display(); // Output: 40 35 30 25 20 10
    }
}
