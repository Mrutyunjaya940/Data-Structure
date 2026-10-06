package ARRAY;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int[] nums={0,1,4,2,3,5,2,0,4,8};
        int[] newNums=new int[nums.length];

        int position=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] !=0)
            {
                newNums[position]=nums[i];
                position++;
            }
        }

        for(int i=0;i<newNums.length;i++)
        {
            System.out.print(+newNums[i]+" ");
        }
    }
}
