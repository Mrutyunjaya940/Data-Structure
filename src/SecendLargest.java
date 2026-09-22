package IBM;

public class SecendLargest {
    public static void main(String[] args) {
        int[] nums={20,2,32,12,423,63,12,465};
        int largest=nums[0];
        int slargest=-1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            }
            else if (nums[i] > slargest && nums[i] != largest) {
                slargest = nums[i];
            }
        }

        System.out.println(slargest);
    }
}
