class Solution {
    Public Static void main(String[] args) {
        for(int i=1; i<=n; i++)
        {
            //Space
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //Star
            for(int j=0; j<(2*i)-1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
