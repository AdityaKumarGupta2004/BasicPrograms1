import java.util.*;
import java.util.Scanner;
interface Interface1{
    void area();
}
interface Interface2 extends Interface1
{
    void vol();
}
class calc implements Interface1,Interface2
{
    public void area(int l , int b)
    {
        int area = l*b;
        System.out.println("area of rect : "+area);

    }
    public void vol(int l , int b , int h){
        int volume = l*b*h;
        System.out.println("volume of object is: "+volume);
    }
}
/**
 * interface
 */
 class Example {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the values");
            int x= sc.nextInt();
            int y= sc.nextInt();
            int z= sc.nextInt(); 
            calc ob = new calc();
            ob.area(x,y);
            ob.vol(x,y,z);

        }   
}