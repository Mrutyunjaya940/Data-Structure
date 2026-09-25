package IBM;

import java.util.HashSet;

public class UnionNumber {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={3,4,5,6};

        HashSet<Integer> set=new HashSet<>();

        for (int i=0;i<arr1.length; i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++)
        {
            set.add(arr2[i]);
        }
        System.out.println(set);

    }
}
