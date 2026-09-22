package IBM;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={10,20,3,12,12,12,89,70};
        int target=arr[0];
        // int slargest=-1;
        for(int i=1;i< arr.length; i++)
        {
            if(arr[i] >target) {
                target=arr[i];
            }
        }

        System.out.println(target);
    }
}
