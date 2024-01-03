package JavaOOP.InheritenceDemo;

public class Person {
    
    String name; 
    int age;
    String address; 

    // make the method 
    public void printPerson() {

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

    }

    // initialize the variables 
    public Person(String n, int a, String add) {

        name = n;
        age = a;
        address = add;

    }

}
