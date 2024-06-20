import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;

public class App {
    public static int BinarySearch(Integer arr[],int key){
        int mid;
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            mid  = low + (high-low)/2;
            if(arr[mid]>key)
            {
                low = mid+1;
            }
            else if(arr[mid]<key)
            {
                high = mid-1;
            }
            else
            {
                return mid;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) throws Exception {
        Integer arr[] = {2,34,1,24,35,32,5,6,3,4,12};

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Given Array is : ");
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        System.out.println();
        System.out.println("Found 35 at index: "+ BinarySearch(arr,34));
    }
}
