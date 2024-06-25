public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        // Testing enqueue operation
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        // Trying to enqueue another element when the queue is full
        cq.enqueue(60);

        // Printing the queue elements
        cq.printQueue();

        // Testing dequeue operation
        System.out.println("Dequeued element: " + cq.dequeue());
        System.out.println("Dequeued element: " + cq.dequeue());

        // Printing the queue elements after dequeue
        cq.printQueue();

        // Testing peek operations
        System.out.println("Front element: " + cq.peekFront());
        System.out.println("Rear element: " + cq.peekRear());

        // Enqueueing more elements
        cq.enqueue(60);
        cq.enqueue(70);

        // Printing the queue elements after more enqueue operations
        cq.printQueue();
    }
}
