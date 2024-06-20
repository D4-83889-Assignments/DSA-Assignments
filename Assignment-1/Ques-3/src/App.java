public class App {
    public static int LinearSearchComparisonCount(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i + 1;
            }
        }
        return arr.length;

    }

    public static int BinarySearch(int arr[], int key)
    {
        int mid;
        int low = 0;
        int high = arr.length-1;
        int count = 0;
        while(low<=high)
        {
            mid = low+((high-low)/2);
            if(arr[mid]<key)
            {
                low = mid+1;
            }
            else if(arr[mid]>key)
            {
                high =  high -1 ;
            }
            else
            {
                count++;
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3,5,5,6,7};
        System.out.println("No. of comparisons to find 4 : "+ LinearSearchComparisonCount(arr, 4));
        System.out.println("No of Comparisons to find 8 using binary Search: "+ BinarySearch(arr,8));
    }
}
