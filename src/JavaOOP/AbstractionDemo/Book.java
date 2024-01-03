package JavaOOP.AbstractionDemo;

public class Book implements Printable, Interface2 {
    
    public void print() {

        System.out.println("The book is printed");

    }

    public void testMethod() {

        System.out.println("This is a test method from the udemy course");

    }

    public void m1() {
        System.out.println("This is m1() from the book class");
    }

}
 