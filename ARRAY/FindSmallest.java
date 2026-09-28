package ARRAY;

import java.lang.reflect.Array;

public class FindSmallest {
    public static void main(String[] args) {
        int[] arr={2,3,12,12,12,89,1};
        int target=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i] < target)
            {
                target= arr[i];
            }
        }
        System.out.println(target);

    }
}
