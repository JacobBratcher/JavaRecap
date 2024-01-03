package JavaOOP.PolymorphismDemo;

public class MethodOverLoadingDemo {
    
// overloading methods, so there is a method for each option
// options include adding 2 integers up to adding 4 integers 

    public void add(int a) {
        System.out.println("You need to add atleast 2 numbers");
    }

    public void add(int a, int b) {
        System.out.println(a+b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public void add(int a, int b, int c, int d) {
        System.out.println(a+b+c+d);
    }

}
