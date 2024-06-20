import java.util.Arrays;


public class App {
    public static int findRank(int arr[],int ele){
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i]==ele && i!=arr.length-1)
            {
                while(arr[i]==arr[i+1])
                {   
                    i++;
                }
                break;
            }
        }
        if(i==arr.length)
        {
            return i;
        }
        return i+1;
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {10,20,15,3,4,4,1};
        //find rank of an element...

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Rank of 20 is "+findRank(arr, 20));



    }
}
