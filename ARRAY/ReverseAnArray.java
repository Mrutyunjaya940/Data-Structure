package ARRAY;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int first=0;
        int last= arr.length-1;
        int[] newarr={};
        while (first <last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
}
