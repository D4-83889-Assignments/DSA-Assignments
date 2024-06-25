class Deque {
    private Node head, tail;

    private static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    // Insert an element at the front of the deque
    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert an element at the rear of the deque
    public void insertRear(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete an element from the front of the deque
    public int deleteFront() {
        if (head == null) {
            System.out.println("Deque is empty");
            return -1;
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        return data;
    }

    // Delete an element from the rear of the deque
    public int deleteRear() {
        if (tail == null) {
            System.out.println("Deque is empty");
            return -1;
        }
        int data = tail.data;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        return data;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Display the elements of the deque
    public void display() {
        if (head == null) {
            System.out.println("Deque is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.insertFront(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.insertRear(30);
        deque.display(); // Output: 5 10 20 30

        System.out.println("Deleted from front: " + deque.deleteFront()); // Output: 5
        deque.display(); // Output: 10 20 30

        System.out.println("Deleted from rear: " + deque.deleteRear()); // Output: 30
        deque.display(); // Output: 10 20
    }
}
