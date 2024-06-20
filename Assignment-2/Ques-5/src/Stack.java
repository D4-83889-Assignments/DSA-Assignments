public class Stack {
    private int top = 0 ;
    private int size;
    private int arr[];
    Stack(int size){
        this.size = size;
        top = size;
        arr = new int[size];
    }

    public boolean isFull(){
        if(top==0)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(top==size)
        {
            return true;
        }
        return false;
    }
    public void push(int i)
    {
        if(!isFull())
        {
        top--;
        arr[top] = i;
        }
        else
        {
            System.out.println("Stack is Full..");
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        else
        {
            int temp = arr[top];
            top++;
            return temp;
        }
    }

}
