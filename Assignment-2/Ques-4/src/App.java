public class App {
    public static void main(String[] args) throws Exception {
        LinearQueue lq = new LinearQueue(4);
        lq.enqueue(1);
        lq.enqueue(1);
        lq.enqueue(1);
        lq.enqueue(1);
        lq.enqueue(1);

        System.out.println(lq.toString());

        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
    }
}
