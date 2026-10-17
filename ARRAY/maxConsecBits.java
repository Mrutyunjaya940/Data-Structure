class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
      
          if(arr == null || arr.length==0)
          {
              return 0;
          }
          int maxlength=1;
          int currentlength=1;

          for(int i=1;i<arr.length;i++)
          {
              if(arr[i] == arr[i-1])
              {
                  currentlength++;
              }
              else
              {
                  maxlength=Math.max(maxlength,currentlength);
                  currentlength=1;
              }
          }
          maxlength=Math.max(currentlength, maxlength);
          return maxlength;
      }
}


// Input: arr[] = [0, 1, 0, 1, 1, 1, 1]
// Output: 4
// Explanation: The maximum number of consecutive 1’s in the array is 4 from index 3-6.
