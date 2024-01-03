package JavaOOP.OOPIntro;

public class Employee {

// if you hard code the variables the employee will always hold these values 
String employeeName; // equals null because value is not specified 
String employeeDept; // equals null because value is not specified
int salary; // equals 0 because value is not specified

public void printEmployee() {

    System.out.println(employeeName);
    System.out.println(employeeDept);
    System.out.println(salary);

}

// if constructor is not found, print this to the console 
public Employee() {

    System.out.println("No arguement constuctor got executed.");

}

// basic constructor 
public Employee (String n, String d, int s) {

    this(); // calling another constructor, this line must be at top
    employeeName = n;
    employeeDept = d;
    salary = s; 

}

// can write multiple contstructors that inlcude different values
public Employee (String n, String d) {

    employeeName = n;
    employeeDept = d;

}


}