public class InvertedNumberTriangle {
//            12345
//            1234
//            123
//            12
//            1
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
