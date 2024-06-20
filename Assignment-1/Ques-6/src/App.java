import java.util.Arrays;

public class App {

    public static int LinearSearchNthOccurance(int arr[], int key, int n)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
            {
                count++;
                if(count==n)
                {
                    return i ;
                }
                
            }
            
        }
        return -1;
    }
        
    

    public static void main(String[] args) throws Exception {
        int arr[] = { 10, 12, 34, 45, 45, 45, 67, 78 };
        System.out.println(Arrays.toString(arr));
        System.out.println("3rd occurance of 45 found at index: " + LinearSearchNthOccurance(arr, 45, 3));
    }
}
