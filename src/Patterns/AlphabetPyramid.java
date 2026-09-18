public class AlphabetPyramid {

//    A
//   ABC
//  ABCDE
// ABCDEFG
//ABCDEFGHI

    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (char ch='A'; ch<= 'A' +(2*i); ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
