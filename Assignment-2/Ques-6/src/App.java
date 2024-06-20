import java.util.Stack;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        int ele;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Push an element to the Stack..");
            ele = sc.nextInt();
            mainStack.push(ele);
            if (!maxStack.isEmpty() && ele > maxStack.peek()) {
                maxStack.push(ele);
            } else if (maxStack.isEmpty()) {
                maxStack.push(ele);
            }

        }
        System.out.println("Maximum element is : " + maxStack.peek());
    }
}
