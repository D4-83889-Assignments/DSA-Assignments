public class Stack {
    private Node top;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop an element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Peek at the top element of the stack
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the elements of the stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: 30 20 10

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        stack.display(); // Output: 20 10

        System.out.println("Top element: " + stack.peek()); // Output: 20
        stack.display(); // Output: 20 10
    }
}