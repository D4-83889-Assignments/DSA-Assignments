

public class App {

    public static int NonRepeating(int arr[]) {

        boolean barr[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (barr[i] != true) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        // Repeated
                        barr[i] = barr[j] = true;
                    }
                }
            }
        }
        int i;
        for (i = 0; i < barr.length; i++) {
            if (barr[i] == false) {
                break;
            }
        }
        if (i >= 0) {
            return arr[i];
        }
        return -1;

    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

        System.out.println("First Non repeating character in the array: " + NonRepeating(arr));
    }
}


