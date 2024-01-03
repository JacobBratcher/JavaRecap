package JavaOOP.AbstractDemo;

public abstract class Vehicle {
    
    // Abstrct method 

    public abstract void run();

    // Non-abstract method 

    public void testMethod() {

        System.out.println("This is a non-abstract method of the Vehicle class.");

    }

    String name; 

    public Vehicle(String n) {
        name = n;
    }

}
