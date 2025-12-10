import java.util.Scanner;

class factNum
{
    static long fact(int x){
        if (x==0)
        return 1;
        else 
        return (x*fact(x-1));
    }
}
class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int x =sc.nextInt();
        int y =sc.nextInt();
        long fact;
        for(int i=x;i<=y;i++){
        fact = factNum.fact(i);
        
        System.out.println("factorial of "+i+" is "+fact);
        
        }    
    }

}