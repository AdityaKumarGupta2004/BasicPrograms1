import java.util.Scanner;  // Import the Scanner class



class array{
    public static void main(String[] args) {
        Scanner  ob = new Scanner(System.in);
        double a[]= new double[50];
        System.out.println("Enter the no. of elements");
        int n = ob.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter The Elements\n:");
            a[i]=ob.nextInt();
        }
         for(int i=0;i<n;i++){
            System.out.print("Entered Elements are:"+a[i]);
         }

    }
}