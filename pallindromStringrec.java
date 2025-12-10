class check12
{
    public static Boolean chk(String s,int i)
    {
        int n=s.length();
        if(i>=s.length()) return true;
        if(s.charAt(i) != s.charAt(n-i-1))
        return false;
        return chk(s,i+1);


    }
}

public class pallindromStringrec {
    public static void main(String[] args) {
     String s= "111112222211111";
     if(check12.chk(s,0))
     {
        System.out.println("Pallindrome");
     }
     else
     System.out.println("not");

    }
}
