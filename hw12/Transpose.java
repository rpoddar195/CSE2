/* Ritika Poddar
HW #12
CSE2
*/

import java.util.Scanner;
import java.util.*;

public class Transpose{
    
    public static void main(String[] args){
       
       Scanner myinput = new Scanner(System.in);
       int length =0;
       int width =0;
       int temp =0;
       int temp2 = 0;
       
       boolean validinput = false;
       boolean validinput2 = false;
       
       System.out.println("Please enter a row length: ");
       while (!validinput){
           if(myinput.hasNextInt()){     //check to see if input is an integer
              temp = myinput.nextInt();
               if(temp>0){               // check to see if input is positive
                   length = temp;
                   validinput = true;    // if true then save input
              
             
      System.out.println("Please enter a column length: ");      
        while (!validinput2){
           if(myinput.hasNextInt()){  //check to see if input is an integer
               temp2 = myinput.nextInt();
               if(temp2>0){  // check to see if input is positive
                   width = temp2;
                   validinput2 = true;    // if true then save input
               }
               else {
              System.out.println("Please enter a positive integer: ");
               myinput.next();      // otherwise ask again
              }
           }
           else{
               System.out.println("Please enter a positive integer: ");
               myinput.next();    // otherwise as again
           }
              
              
               }
               
               }   
               else {
              System.out.println("Please enter a positive integer: ");
               myinput.next();         // if not positive as again
               }
           }
           else{
               System.out.println("Please enter an integer: ");
               myinput.next();      // if not an integer ask again
           }
            
       
                    
           
           
         }// end of while loop
      
      
       
       
       // save the ranom matrix 
        
       int[][] Matrix = randomMatrix(length, width);
        
        printMatrix(Matrix, length, width);
      // print out the matrix
       if(length != width){
        transposeMatrix(Matrix, length, width);   // transpose random matrix and print new matrix
       }
        
        
     }// end of main method
     
     
     public static int[][] randomMatrix( int width, int length){
       
       //create a row major array based on inputs of user  
         int myArray[][];
         myArray = new int [width][length];
        
    
    //input random numbers for each memeber array with two for loops     
      for(int x=0; x< width; x++){    
        for(int i=0;i< length; i++){
            int random = (int) (Math.random()*21) - 10;
            myArray[x][i] = random;
        }
      }   
      
       return myArray;  
     }// end of randomMatrix
     
     
     public static void printMatrix( int [] [] myArray, int length, int width){
        
       if(length != width){
        System.out.println("Here is the random Matrix: ");
        // for loop to print out 2D array
         for( int a=0; a< myArray.length; a++){
           
           for( int b=0; b< myArray[a].length ; b++){
              System.out.print(myArray[a][b] + " ");  // print out array
           }
       
         System.out.println(" ");
           
       }
         
       }
       else {      // test to see if a rectangle other wise error message is printed out
           System.out.println("Width and length do not make a rectangle");
       }
         
         
     }// end of printMatrix
     
     
     public static void transposeMatrix( int [] [] myArray, int length, int width){
      int column = width;
      int row = length;
      
       int TArray [][];
      TArray = new int [column][row];   // new transpose array
         
          for( int a=0; a< column; a++){
           
           for( int b=0; b< row; b++){
             TArray[a][b] = myArray[b][a];  // transpose array using a for loop
           }
        
          }
        
         System.out.println("Here is the Transpose: "); 
         
          for( int a=0; a< column ; a++){
           
           for( int b=0; b< row; b++){
              System.out.print(TArray[a][b] + " "); // print out transposed array
           }
       
         System.out.println(" ");
           
       }
         
         
         
     }// end of transpose
     
     
    
    
}// end of class