import java.util.Arrays;

public class LinearQueue {
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    private int arr[];

    LinearQueue(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isFull() {

        if (rear == size) {
            return true;
        }
        return false;

    }

    public void enqueue(int el) {
        if (!isFull()) {
            arr[rear++] = el;
        } else {
            System.out.println("Array is Full...");
        }
    }

    public boolean isEmpty() {
        if (rear == 0 || front==size) {
            return true;
        }
        return false;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return arr[front++];
        }
    }

    @Override
    public String toString() {
        return "LinearQueue [front=" + front + ", rear=" + rear + ", size=" + size + ", arr=" + Arrays.toString(arr)
                + "]";
    }

    
}
