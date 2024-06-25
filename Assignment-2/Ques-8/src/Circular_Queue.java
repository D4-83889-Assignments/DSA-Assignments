public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize the queue
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to add an element to the queue
    public boolean enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        return true;
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Method to get the front element of the queue
    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element");
            return -1;
        }
        return queue[front];
    }

    // Method to get the rear element of the queue
    public int peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No rear element");
            return -1;
        }
        return queue[rear];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the current size of the queue
    public int getSize() {
        return size;
    }

    // Method to print the elements of the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

