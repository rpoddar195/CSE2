/*Ritika Poddar
CSE2
HW#11
*/



import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;//for sorting later 



public class CSE2Linear{
    
    
    
    public static void main(String[] args){
       
        int StudentGrades[];   
       
        StudentGrades = new int[15];
     
     
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        Scanner myinput = new Scanner(System.in);
        
        for( int i =0; i<15; i++){
            
            //check for input errors
          boolean Validinput = false;
           while(!Validinput){
               
           if(myinput.hasNextInt()){
               StudentGrades [i] = myinput.nextInt();
               Validinput = true;
           }
            else if(!myinput.hasNextInt()){
                System.out.println("Error: Not an integer");
                myinput.next();
                continue;
            }
            
            if(StudentGrades [i] < 0 ){
                System.out.println("Error: Input out of range");
                myinput.next();
                continue;
            }
            if(StudentGrades[i] >100){
                System.out.println("Error: Input out of range");
                myinput.next();
                continue;
            }
            if(i >0 ){
                if(StudentGrades[i] < StudentGrades[i-1]){
                System.out.println("Error: input not larger than previous input");
                myinput.next();
                continue;
            }
            }
            
           }// end of while loop
            
        }// end of for loop
        
       
        System.out.println("Sorted: ");
        printFinalArray(StudentGrades);
        
        System.out.println("Enter a grade to search for:");
        int userinput = myinput.nextInt();
       
        SearchArray(StudentGrades, userinput);
        
        
        
        System.out.println("Shuffled: ");
        studentShuffle(StudentGrades);
        
        System.out.println("Enter a grade to search for:");
        int scrambledsearch = myinput.nextInt();
        SearchScrambledArray(StudentGrades, scrambledsearch);
    
       
        
        
        
        
        
    } // end of main method
    
  
       
   
  public static void SearchArray(int [] StudentGrades, int userinput){
        int minimum = 0;
        int maximum = StudentGrades.length-1;
        
       // boolean foundit = false;
        int counter = 0;
       
      
          
           /* for( int j =0; j<15; j++){
            if(StudentGrades[j] == userinput){
                System.out.println(userinput + " was found in the list with " + j + " iterations.");
            break;
                
            } 
            else if( j == 15){
                System.out.println(userinput + " wasn't found in the list with " + j + " iterations.");
                
            }
        }
           */
           
            while(maximum >= minimum ){
            int mid = (minimum + maximum)/2;
            
            if(StudentGrades[mid] == userinput){
                System.out.println(userinput + "was found in the list with "+ counter + " iterations.");
             //   foundit = true;
                break;
            }
            else if(StudentGrades[mid] > userinput){
                maximum = mid - 1;
            }
            else if(StudentGrades[mid] < userinput ){
                minimum = mid + 1 ;
                 }
            counter ++;
            } 
            
            if(maximum < minimum){
                System.out.println(userinput + " wasn't found in the list with " + counter + " iterations.");
            }
        
        
        
  }
  
  
  public static void SearchScrambledArray (int [] StudentGrades, int scrambledsearch){
   
    for( int j =0; j<15; j++){
            int x = j + 1;
            
            if(StudentGrades[j] == scrambledsearch){
                System.out.println(scrambledsearch + " was found in the list with " + x + " iterations.");
            break;
                
            } 
            else if( j == 14){
                
                System.out.println(scrambledsearch + " wasn't found in the list with " + x + " iterations.");
                
            }
        }
   
      
  }
  
   
    public static void printFinalArray( int [] StudentGrades){
         Arrays.sort(StudentGrades);
         
         for (int i = 0; i < 15; i++) {
                System.out.print(StudentGrades[i] + " ");  
            }    
        
        
    }
    
    public static void studentShuffle( int[] StudentGrades){
      
       

       // shuffle the each loop
        for(int i =0; i<15; i++){
            int firstcard= StudentGrades[0];
            int x = (int) (Math.random()*15); 
            StudentGrades[0] = StudentGrades [x];
            StudentGrades [x] = firstcard;
      
        }
        
       // print them out
        for (int i = 0; i < 15; i++) {
                System.out.print(StudentGrades[i] + " ");  
            } 
        
        
    }
    
    
    
    
    
}// end of class