import java.util.Arrays;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> st = new Stack<>();
        int arr[] = { 12, 13, 24, 22, 45 };
        System.out.println(Arrays.toString(arr));
        for (int ele : arr) {
            st.push(ele);
        }
        for (int index = 0; index < arr.length; index++) {
            arr[index] = st.pop();
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
