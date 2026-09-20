public class FloydsTriangle {
//            1
//            23
//            456
//            78910
//            1112131415
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for(int i=0;i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(num+" ");
                num += 1;
            }
            System.out.println();
        }
    }
}
