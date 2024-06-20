import java.util.Arrays;

public class App {

    public static void insertion_Sort_Desc(int arr[]) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            int j;
            temp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (temp > arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
        insertion_Sort_Desc(arr);
        System.out.println(Arrays.toString(arr));
    }
}
