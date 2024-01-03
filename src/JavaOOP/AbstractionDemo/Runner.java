package JavaOOP.AbstractionDemo;

public class Runner {
    
public static void main(String [] args) {

Book b1 = new Book();

b1.print();

b1.testMethod();

b1.m1();

System.out.println(Printable.name);
System.out.println(Printable.address);

}

}
