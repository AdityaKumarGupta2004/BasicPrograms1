import java.util.*;

 class arm{
    static void chk(int x)
    {
        int num ;
        num = x;
        int arm = 0,rem;
        while(x != 0)
        {
            rem = x%10;
            arm = arm + rem*rem*rem;
            x=x/10;
        }
        if(arm == num)
        System.out.println("The Number "+num+" is armstrong no.");
    }
    
}
class armstrong{

    public static void main(String[] args) {
        int a,b;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter The Number:\n");
        a= ob.nextInt();
        b= ob.nextInt();
        int c = 1^2^3^4^5^6;
        System.out.println(c);
       for(int i = a ; i<=b; i++)
        {
            arm.chk(i);
        }
        ob.close();
    }
    
}