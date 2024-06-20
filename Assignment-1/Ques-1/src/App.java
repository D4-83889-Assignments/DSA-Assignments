import java.util.Stack;

public class App {

    public static boolean PalinDrome1(int num) {
        int temp = num;
        int rem = 0;
        int res = 0;
        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            res = (res * 10) + rem;
        }
        if (res == num) {
            return true;
        }
        return false;
    }

    public static boolean Palindrome2(String num) {

        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                return false;
            }

        }
        return true;
    }

    public static boolean PalindromeStack(int num) {
        Stack<Integer> st = new Stack<>();
        int temp = num;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            st.push(rem);
        }
        int res = 0;
        while (!st.isEmpty()) {
            res = res * 10 + st.pop();
        }
        if (res == num) {
            return true;
        }
        return false;
    }

    public static boolean isPalindromeRecursive(int num) {
        String str = Integer.toString(num);
        int right = str.length() - 1;
        int left = 0;
        return palindromeRecursiveHelper(left, right, str);

    }

    public static boolean palindromeRecursiveHelper(int left, int right, String str) {
        // Base case 1
        if (left >= right) {
            return true;
        }
        // Base case 2
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
        return palindromeRecursiveHelper(left, right, str);
    }

    public static void main(String[] args) throws Exception {
        int num = 11;
        if (PalinDrome1(num)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Its not a Palindrome");
        }
        String num2 = "011110";
        if (Palindrome2(num2)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Its not a Palindrome");
        }

        int num3 = 454;
        if (Palindrome2(Integer.toString(num3))) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
        int num4 = 34343;
        if (PalindromeStack(num4)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        int num5 = 743;
        if (isPalindromeRecursive(num5)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

}
