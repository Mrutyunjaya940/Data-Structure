package ARRAY;

import java.util.HashSet;

public class Duplicate
{
    public static void main(String[] args)
    {
        int[] arr={2,3,2,12,12,8,9,9,1,0};
        //Using Brute Force Code
        Duplicate02(arr);

        for(int i=0;i< arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i] == arr[j])
               {
                   System.out.print(arr[i]+" ");
               }
           }
        }
    }

    //Using HashSet.

    public static void Duplicate02(int[] nums)
    {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();

        for (int num: nums)
        {
            if( !set.add(num))
            {
                duplicate.add(num);
            }
        }
        for(int dup:duplicate)
        {
            System.out.println(dup+" ");
        }

    }
}
