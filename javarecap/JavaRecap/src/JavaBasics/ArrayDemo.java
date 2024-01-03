package JavaBasics;
public class ArrayDemo {
    
    public static void main(String[] args) {
         
        // use arrays if you have multiple of the same type of variable 
        // how to start the array
        String studentName [] = new String[5];

        studentName[0] = "John"; 
        studentName[1] = "Smith";
        studentName[2] = "Mike";
        studentName[3] = "Michael";
        studentName[4] = "Larry";
        
        // how to use certain element in the array
        System.out.println(studentName[2]);
        
        for (int i = 0; i < studentName.length; i++) {

            System.out.println(studentName[i]);

        }
    }

}
