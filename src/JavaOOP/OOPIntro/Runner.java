package JavaOOP.OOPIntro;

public class Runner {
    
public static void main(String[] args) {
    
// Create object of employee class 
// ClassName RefVarName = new Contructor()

// first employee's information 
Employee emp1 = new Employee("Mike", "QA");
emp1.printEmployee();

// second employee's information
Employee emp2 = new Employee("Smith", "IT", 200);
emp2.printEmployee();

}

}
