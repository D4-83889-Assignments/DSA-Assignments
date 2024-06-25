class CircularLinkedList {
    private Node tail;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // Circular link
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Display the list
    public void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println();
    }

    // Delete a node with a given key
    public void delete(int key) {
        if (tail == null) return;

        Node current = tail.next;
        Node prev = tail;

        do {
            if (current.data == key) {
                if (current == tail.next && current == tail) {
                    tail = null;
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display(); // Output: 10 20 30 40 

        list.delete(20);
        list.display(); // Output: 10 30 40 

        list.delete(10);
        list.display(); // Output: 30 40 

        list.delete(40);
        list.display(); // Output: 30
    }
}
