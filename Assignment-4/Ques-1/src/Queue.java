public class Queue {
    private Node front, rear;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Enqueue an element into the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue an element from the queue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display the elements of the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Output: 10 20 30

        System.out.println("Dequeued element: " + queue.dequeue()); // Output: 10
        queue.display(); // Output: 20 30

        queue.enqueue(40);
        queue.display(); // Output: 20 30 40
    }
}
