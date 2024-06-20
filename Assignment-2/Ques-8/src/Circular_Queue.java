public class Circular_Queue {
    private int count;
    private int capacity;
    private int arr[];

    public Circular_Queue(int capacity) {
        this.capacity = capacity;
        count = 0;
    }

    public boolean isEmpty(){
        return (count==0);
    }
    public boolean isFull(){
        return (count==capacity);
    }

    public void enqueue(int ele){
         
    }

}
