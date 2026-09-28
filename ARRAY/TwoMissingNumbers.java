package ARRAY;

public class TwoMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int n = arr.length + 2;
        int count = 0;

        for (int i = 1; i <= n; i++) {

            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
                count++;
                
                if (count == 2) {
                    break;
                }
            }
        }
    }
}
