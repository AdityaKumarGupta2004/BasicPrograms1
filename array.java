import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        double a[] = new double[50];
        System.out.println("Enter the no. of elements:");
        int n = ob.nextInt();
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            a[i] = ob.nextInt();
        }
        ob.close();
        System.out.print("Entered Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }

    }
}