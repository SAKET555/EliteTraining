import java.util.*;
public class UniqueElements {
    public static void main(String[] args)
    {
        int arr[] = {2,2,2,2,2,2,2,2,2,2,3};
        if(arr.length < 2)
        {
            System.exit(0);
        }
        Arrays.sort(arr);
        if(arr[0] < arr[1])
        {
            System.out.println(arr[0]);
        }
        else if(arr[arr.length-1] > arr[arr.length - 2])
        {
            System.out.println(arr[arr.length-1]);
        }
        else
        {
            System.exit(0);
        }
    }
}