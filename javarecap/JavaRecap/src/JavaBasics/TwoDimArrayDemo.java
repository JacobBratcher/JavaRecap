package JavaBasics;
public class TwoDimArrayDemo {
    
    public static void main(String[] args) {
        
        // how to start 2d array
        // values after new int are the number of columns and rows 

        int [][] studentMarks = new int [2][2];

        // asign the values to the array

        studentMarks[0][0] = 5; 
        studentMarks[0][1] = 6; 


        studentMarks[1][0] = 15; 
        studentMarks[1][1] = 16;

        // call the elements from the 2d array

        System.out.println(studentMarks [1][0]);

    }

}
