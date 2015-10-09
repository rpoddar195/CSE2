/*Ritika Poddar
CSE 002
Lab 07
Nested loop: ecrypted X
*/

import java.util.Scanner;
import java.util.*;

public class encrypted_x{
    public static void main(String[] args){
        
        
        Scanner myScanner = new Scanner (System.in);
        
      
        boolean acceptable = false;
        int myinput = 0;

        //loop until you get valid input 
        System.out.print("Please enter your input: ");
        while( !acceptable ){

        //check if the input is a int.
        if (myScanner.hasNextInt() ){
          myinput = myScanner.nextInt();  //if so, store it.
          acceptable = true;
        } else {
            System.out.println("ERROR: input is not an integer.");
            System.out.print("Please enter your input:  ");
            myScanner.next();
            continue;
        }
        
        
        if (myinput>0 && myinput<100){
            acceptable = true;
            
        }
        
        else{
            System.out.println("   ERROR: input is out of range");   //if not error message pops up and input discarded.
            System.out.print("Please enter your input: ");
            myScanner.next();
             }
        } 



        //loop for x design
        
        for(int i = 1; i < myinput; i++){
            
            for(int j = 1; j < myinput; j++){
                
                if(i==j){
                    System.out.print(" ");
                        
                } else if(j==myinput-i) {
                    System.out.print(" ");
                    
                   } else {
                    System.out.print("*");
                }
                
            }        
                
        System.out.println("");     
        }   
                
                
                
                
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}