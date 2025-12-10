public class expection {
    public static void main(String[] args) {
        try{
            int a = 100/0;
        }
        catch(ArithmeticException e){
            System.out.println("A number  cannot divided by zero");
        }
        System.out.println("Programs ends ");
    }
}
