class Animal{
    public void walk()
    {
        System.out.println("Animal can walks");
    }
}

class horse extends Animal
{
    public void walk()
    {
        System.out.println("it can walk in 4 legs ");
    }
}

class kangaroo extends Animal{
    public void walk()
    {
        System.out.println("It can walk in 2 legs");
        super.walk();
    }
}

/**
 * runtime
 */
public class runtime {
public static void main(String[] args) {
    kangaroo ob = new kangaroo();
    ob.walk();
}
    
}