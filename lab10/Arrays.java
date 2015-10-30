/* Ritika Poddar
Lab #10
Arrays
*/

import java.util.Scanner;

public class Arrays{
    
    public static void main(String[] args){
        
       Scanner input = new Scanner(System.in);
       
       int numstudents = (int)(Math.floor((Math.random()*5)+5));
        
       String[] student; //Declaration
       student = new String[numstudents]; //allocate space
       
        System.out.println("Please enter " + numstudents + " student names: ");
        for (int i = 0; i < numstudents; i++) {
                student[i] = input.next();
        }
        
        
        int[] grades;
        grades = new int[numstudents];
        for(int j =0; j< numstudents; j++){
            grades[j] = (int) (Math.floor(Math.random()*100));
        }
        
       
       System.out.println("Here are the midterm grades of the " + numstudents + " students above:");
       for(int i=0; i<numstudents; i++){
           System.out.println(student[i] + " : "+ grades[i]);
           } 
        
        
        
        
        
        
        
        
        
        
    }
    
    
}