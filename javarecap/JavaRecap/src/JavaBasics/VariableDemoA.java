package JavaBasics;
public class VariableDemoA {
    
    //Instance variable is made outside of the method
    // Accessible in all the methods and blocks 
    String employeeName = "John";

    // Default values for variables are String = null, int = 0 

    // Calling other public varible from Variable Demo Class A
    String value = VariableDemoB.publicEmployeeName;

    public void printEmployee() {

        System.out.println(employeeName);

    }

    public void printPublicEmployeeName() {

        System.out.println(value);

    }

}
