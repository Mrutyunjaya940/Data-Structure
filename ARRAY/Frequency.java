package ARRAY;

public class Frequency {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 4, 3, 2, 5};

        for (int i = 0; i < arr.length; i++) {

            // Skip already counted elements
            if (arr[i] == -1) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}
