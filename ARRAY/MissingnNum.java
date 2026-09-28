package ARRAY;

public class MissingnNumber {
    public static void main(String[] args) {
        int[] arr={ 6,9, 4, 2, 3, 5, 7, 0, 1};
        //Output is 8
        int xor = arr.length;

        for(int i = 0; i < arr.length; i++)
        {
            xor = xor ^ i ^ arr[i];
        }

        System.out.println(xor);
    }
}
