import java.util.Scanner;
import java.util.*;

public class Twisty{
    public static void main(String[] args){
        
        
        Scanner myScanner = new Scanner (System.in);
        
      // input and input checking for length
        boolean acceptablelength= false;
        double mylength = 0.0;

        //loop until you get valid input 
        System.out.print("Please enter your length: ");           
        while( !acceptablelength ){

        //check if the input is a double.
        if (myScanner.hasNextDouble() ){
          mylength = myScanner.nextDouble();  //if so, store it.       
          acceptablelength = true;
        } else {
            System.out.println("ERROR: input is not an double.");     //if not a double, this error pops up
            System.out.print("Please enter your length:  ");
            myScanner.next();
            continue;
        }
        
        if(mylength>80){                                            // check to see how long the input is
            System.out.println("ERROR: input is too long.");
            System.out.print("Please enter length shorter than 80: ");  //if too long this error pops up
            myScanner.next();
        }
        
        
        }
        
        
        // input and input checking for width
        boolean acceptablewidth= false;
        double mywidth = 0.0;
        
        
         System.out.print("Please enter your width: ");
        while( !acceptablewidth ){

        //check if the input is a double.
        if (myScanner.hasNextDouble() ){
          mywidth = myScanner.nextDouble();  //if so, store it.
          acceptablewidth = true;
        } else {
            System.out.println("ERROR: input is not an double.");     //if not a valid input, this error pops up
            System.out.print("Please enter your width:  ");
            myScanner.next();
            continue;
             }
        
       if(mywidth > mylength){                                      // check the length of the width
           System.out.println("ERROR: width is too long.");
           System.out.print("Please enter a width shorter than the length: ");          // if the width is too long this error pops up
           myScanner.next();
           
       }
       
       
        }
        
      



        //loop for x design
        
    
       
    
           
            for(int i = 0; i < mywidth; i++){   //loop for printing out each line vertically
                
                for(int j = 0; j< mylength; j++){  //loop for printing out each character horizantally
                    
             
                if(i==j%mywidth){                   //loop for each character in the line
                  
                   if( (int) (j /mywidth)%2 ==0){    //checking to see what type of x it is
                
                     System.out.print("#");
                        
                } else {
                    System.out.print("\\");
                    
                   } 
                     
                }
             else if((j%mywidth)==mywidth-i-1) {      //loop for each character in the line
                  
                  if( (int) (j/mywidth)%2 ==0){      //checking to see what type of x it is
                    System.out.print("/");
                    
                   } else {
                    System.out.print("#");
                     }
                   
               } 
               
              else{
                  System.out.print(" ");     //if none of these are true, just print a space
              }  
                 
        
           
        }   
    
     System.out.println("");        //make sure each line is underneath the previous one
      }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
                
    }
}