
import java.util.Scanner;

public class palindrame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    int k = n;
    int d, rev = 0;
    while (n != 0) {
      d = n % 10;
      n = n / 10;
      rev = rev * 10 + d;
    }
    if (rev == k)
      System.out.println("number is pallindrome");
    else
      System.out.println("Not pallindrome ");
    sc.close();
  }
}
