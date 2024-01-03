package JavaOOP.AbstractDemo;

public class Bike extends Vehicle {
    
    int speed;

public void run() {
    System.out.println("Bike is running.");
}

public Bike(String n, int sp) {

    super(n);
    speed = sp;

}

public void showBike() {

    System.out.println("The name of the bike is " + name);
    System.out.println("Speed of bike is " + speed);
}

}
