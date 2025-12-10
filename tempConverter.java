import java.util.Scanner;

public class tempConverter {

    public static double celToFah(double cel) {
        return (cel*9/5)+32;
    }

    public static double fahToCel(double fah) {
        return (fah-32)*5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature value which is to be Converted  : ");
        double t = sc.nextDouble();

        System.out.print("Enter the Unit of the temperature (C for Celsius, F for Fahrenheit): ");
        String u = sc.next().toUpperCase();

        if (u.equals("C")) {
            double convertTemp = celToFah(t);
            System.out.printf("%.3f°C is equal to %.3f°F%n", t, convertTemp);
        } else if (u.equals("F")) {
            double convertTemp = fahToCel(t);
            System.out.printf("%.3f°F is equal to %.3f°C%n", t, convertTemp);
        } else {
            System.out.println("Invalid unit");
        }

        sc.close();
    }
}
