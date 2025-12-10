class Car {
    // Fields
    String color;
    int year;
    
    // Methods
    void drive() {
        // Method implementation
        System.out.println("this is the class invoked method "+ getClass());
        System.out.println(color );
        System.out.println(year );
    }
}


public class classExample {
    public static void main(String[] args) {
        Car myCar1 = new Car();  // Create the first car object
Car myCar2 = new Car();  // Create the second car object
        myCar1.color="blue";
        myCar2.color="red";
        myCar1.year=1000;
        myCar2.year=2000;
        myCar1.drive();
        System.out.println("----------");
        myCar2.drive();

        System.out.println(Long.MAX_VALUE);


    }
}
