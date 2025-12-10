import java.math.BigInteger;

public class bigInteger {
    public static void main(String[] args) {
        // Create BigIntegers
        BigInteger bigInteger1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInteger2 = new BigInteger("987654321098765432109876543210");

        // Perform arithmetic operations
        BigInteger sum = bigInteger1.add(bigInteger2);
        BigInteger difference = bigInteger1.subtract(bigInteger2);
        BigInteger product = bigInteger1.multiply(bigInteger2);
        BigInteger quotient = bigInteger1.divide(bigInteger2);

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
