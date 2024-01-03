package JavaOOP.AbstractDemo;

public class Runner {

    public static void main(String[] args) {
        
        Bike b1 = new Bike("SuperBike", 100);

        // Abstract method of the vehicle class
        b1.run();

        // Non-abstract method of the vehicle class
        b1.testMethod();

        // Calls the show bike method
        b1.showBike();

        Bike b2 = new Bike("SuperBike 2.0", 200);

        b2.showBike();
    
    }
}