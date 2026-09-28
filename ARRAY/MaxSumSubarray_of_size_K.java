package ARRAY;

public class MaxSumSubarray_of_size_K {
    public static int maxSumSlidingWindow(int[] arr, int k) {

        int windowSum = 0;

        // Calculate first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i - k] + arr[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;

        System.out.println(maxSumSlidingWindow(arr, k));
    }

}
