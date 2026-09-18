public class RepeatedNumberPyramid {
//    1
//   222
//  33333
// 4444444
//555555555

    public static void main(String[] args) {
        int num =5;
        for(int i=1; i<=num; i++)
        {
            for(int j=0; j<num-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
