import java.util.Scanner;
class reverse{
    public static void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    public static void rev(int a[],int l , int r){
       if(l>=r) return;
       swap(a,l,r);
       rev(a,l+1,r-1);
       

    }
}

public class reversingarray {
    public static void main(String[] args) {
       int [] a= new int [100];
       Scanner sc = new Scanner(System.in);
       //System.out.println("Enter the Size of the Array");
       int n=5;
       //System.out.println("Enter the Elememnts of the Array");
       a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
       System.out.println("Array");
       for(int i=0;i<n;i++)
       {
        System.out.print(a[i]+" ,");
       }
       
       reverse.rev(a,0,n-1);
       System.out.println("\nReversed Array");
       for(int i=0;i<n;i++)
       {
        System.out.print(a[i]+" ,");
       }

    }
}
