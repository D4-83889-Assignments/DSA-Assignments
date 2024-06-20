import java.util.Arrays;

public class App {

    public static int InsertionSort(int arr[]) {
        int temp;
        int count  = 0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                count++;
                if (temp < arr[j]) {
                   arr[j+1] = arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("No. of Comparisons it took: "+InsertionSort(arr));
    }
}
