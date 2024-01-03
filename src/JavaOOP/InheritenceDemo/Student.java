package JavaOOP.InheritenceDemo;

// Student class (child class) is inheriting the Person class (parent class) with "extends"
public class Student extends Person {
    
    String courseName; 
    int fees;

    public void printStudent() {

        System.out.println(courseName);
        System.out.println(fees);
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

    }

    // intitialize variables 
public Student(String nm, int ag, String add, String cn, int fee) {

    // super class is the parent class
    super(nm, ag, add);
    courseName = cn; 
    fees = fee; 

}

}
