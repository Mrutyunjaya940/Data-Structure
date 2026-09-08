public class Palindrome{
 public static void main(String[] args)
  {
    int n=121;
    int revers=0;
    int original=n;

    while(n>0)
      {
        int digit= n%10;
        revers= revers *10 + digit;
        n=n/10;
      }
    if(original == revers)
    {
      System.out.print("Numer is Palindrome number");
    }
  }
}
