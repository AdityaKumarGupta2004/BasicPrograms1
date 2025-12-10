public class revnum {
   
    static int rev (int x)
    {
        int rev=0;
        int rem;
     
     while(x!=0)
     {
        rem = x%10;
        rev = rev*10 + rem;
        x= x/10;

     }
        return rev;
    }
}
class check{
    public static void main(String[] args) {
        int x =124;
        int reverseNUM = revnum.rev(x);
        System.out.println("Reverse of "+x+" is "+reverseNUM);

    }

}