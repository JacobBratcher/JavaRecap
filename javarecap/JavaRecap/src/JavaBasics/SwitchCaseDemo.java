package JavaBasics;
public class SwitchCaseDemo {
    
    public static void main (String [] args) {

        int monthNumber = 4; 

        switch(monthNumber) {

            // case number is what the int is equak to
            case 1 : 
                System.out.println("Jan");
                break;

            case 2: 
                System.out.println("Feb");
                break;

            case 3: 
            System.out.println("March");
                break;

            case 4: 
            System.out.println("Apr");
                break;

            // case is if the value is not valid 
            default:
            System.out.println("This is an invalid input");
                break;

        } 

    }

}
