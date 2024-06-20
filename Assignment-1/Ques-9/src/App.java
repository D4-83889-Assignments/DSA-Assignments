import java.util.Arrays;

public class App {

    public static int SelectionSort(int arr[]) {

        int count = 0;
        int indexMin;
        for (int i = 0; i < arr.length; i++) {

            indexMin = i;

            for (int j = i + 1; j < arr.length; j++) {
                count++;
                if (arr[indexMin] > arr[j]) {
                    indexMin = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;

        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {22, 2, 4, 5, 8, 7, 86, 89 };
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("No. of comparisons it took to sort array: "+SelectionSort(arr));
    }
}
