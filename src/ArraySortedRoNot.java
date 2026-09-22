package IBM;

public class ArraySortedRoNot {
    public static void main(String[] args) {
        int[] array={2,1,3,536,1,543,32,32};
        for(int i=2; i< array.length; i++)
        {
            if(array[i] > array[i-1])
            {
                System.out.println("Array is sorted ");
            }
            else
                System.out.println("Not sorted");
        }
    }
}
