public class NumberPyramid {
    //    1
    //   123
    //  12345
    // 1234567
    //123456789

    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
