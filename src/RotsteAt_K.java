package IBM;

public class RotsteAt_K {
    public static void main(String[] args) {
        //rotate an array at 'K' position.

     int[] arr={1,2,3,4,5};
     int k=2;
     int n=arr.length;
        for (int i=0; i<k; i++)
        {
            int last=arr[n-1];

            for(int j=n-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
