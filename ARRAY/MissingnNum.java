package ARRAY;

public class MissingnNumber {
    public static void main(String[] args) {
        int[] arr={ 1,3,4,5};
        int MissingNumber=SumMethod(arr);
        System.out.println("Missing Number is "+MissingNumber);


        //XOR^ method

        int n = arr.length + 1;
        int xor = 0;
        for(int i = 1; i <= n; i++)
        {
            xor = xor ^ i;
        }
        for(int i = 0; i < arr.length; i++)
        {
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }

    //Sum Method

    public static int SumMethod(int[] num)
    {
        int n= num.length+1;
        int ExpectedSum=n*(n+1)/2;
        int arrsum=0;
        for(int i=0;i<n-1;i++)
        {
            arrsum=arrsum+num[i];
        }

        return ExpectedSum-arrsum;
    }
}
