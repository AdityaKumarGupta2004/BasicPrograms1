import java.util.Scanner;

class sample {
    public void check(int[] a, int size) {
        Scanner sc = new Scanner(System.in);
        int i, j, ch, c = 0;
        do {
            System.out.println("Enter the Target :\n");
            int target = sc.nextInt();
            for (i = 0; i < size; i++) {
                for (j = 0; j < size; j++) {
                    if ((a[i] + a[j]) == target)
                        System.out.println("Position =" + i + "," + j);
                    c++;
                }
            }
            if (c == 0)
                System.out.println("NOT FOUND !!! \n");
            System.out.println("Enter Your Choice:\n");
            System.out.println("Any no. for again checking the target\n Enter 0 for Exit\n");
            ch = sc.nextInt();
        } while (ch != 0);
    }
}

class arraysample {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[50];
        System.out.println("Enter the no. of elements");
        int n = ob.nextInt();
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            a[i] = ob.nextInt();
        }
a.sort();
        System.out.print("Entered Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        
        sample ob1 = new sample();
        ob1.check(a, n);

        ob.close(); // Close the Scanner
    }
}
