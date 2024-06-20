public class App {

    public static int LinearSearch(int arr[],int key)
    {
        int res = -1;
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]==key)
            {
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) throws Exception {
      int arr[] = {1,2,3,4,4,4,5};
      System.out.println("Last occurance of 4 in array is : "+LinearSearch(arr,4));
    }
}
