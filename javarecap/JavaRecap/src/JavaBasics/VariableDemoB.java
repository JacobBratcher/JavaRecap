package JavaBasics;
public class VariableDemoB {
    
// this variable can be accessed throughout this class
private String privateEmployeeName = "Private John"; 

// this variable can be accessed by other classes 
// since it is static it will always be Public John 
public static String publicEmployeeName = "Public John";

public void printEmployeeName() {

    // local variable, cannot be accessed outside of this method
    String employeeName = "John";

    System.out.println(employeeName);

}

public void printEmployee() {

    // cannot be accessed because variable is local to a different method 
    // System.out.println(employeeName);
    
    System.out.println(privateEmployeeName);
        
    System.out.println(publicEmployeeName);

}



}
 