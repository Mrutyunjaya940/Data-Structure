package ARRAY;

public class SecendSmallest {
    public static void main(String[] args) {
        int[] arr={2,3,12,12,12,89,1,0};
        int lowest=Integer.MAX_VALUE;
        int secsmall=-1;

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i] < lowest)
            {
                secsmall=lowest;
                lowest=arr[i];
            }

        }
        System.out.println(secsmall);
    }
}
