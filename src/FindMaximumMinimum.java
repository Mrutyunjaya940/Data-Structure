public class FindMaximumMinimum {
    public static void main(String[] args) {
        int[] arr={10,20,50,23,9,12,6,3};

        int max=arr[0];
        int min=arr[0];

        for(int i=0; i< arr.length;i++)
        {
            if(arr[i] >max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Maximun number is "+max);
        System.out.println("Minimum Number is "+min);
    }
}
