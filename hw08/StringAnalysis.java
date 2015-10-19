/* Ritika Poddar
CSE 002
HW #8
*/

import java.util.Scanner;
import java.util.*;

public class StringAnalysis{
    
    public static void main( String[] args){
        
        
      Scanner myinput = new Scanner (System.in);
      
      System.out.println("PLease enter a string:  ");
      
      boolean acceptable = false;
      String inputS = " ";
    
      while(!acceptable){
          if(myinput.hasNextLine()) {
            acceptable = true;
            inputS = myinput.next();
            
              
          } else{
              System.out.println("ERROR: not a string input.");
              System.out.println("Please enter a string:  ");
              myinput.next();
              
          }
          
          
      }
      
       System.out.println(" How much of the input do you want to evaluate? Please enter a number or put all: ");
      
       boolean Stringindex = false;
       if(myinput.hasNextInt()){
           int EvaluateString = myinput.nextInt();
          Stringindex = myMethod(EvaluateString, inputS);//calling method
       
       }
      
      else if (myinput.hasNextLine())
       {  String EvaluateS = myinput.next();
         Stringindex = myMethod(inputS);//calling the method
       }
      
       
        if( Stringindex == true){
           System.out.println("Characters are all letters.");
           
       } else if (Stringindex == false){
           System.out.println("All characters are not letters.");
       }
       
       
        
        
        
        
        
    }// end of main method
    
    
    public static boolean myMethod(String inputS){
       int counter = 0;
       boolean x = false;
       for (int i=0; i< inputS.length(); i++){
       char result = inputS.charAt(i);
            
           
            if(result<= 'z' && result >= 'a'){
                counter++;
                
            } 
        
       }
       
       if(counter == inputS.length()){
          x= true;
          
       }
       
       return x;  
        
    }
    
    
    public static boolean myMethod(int EvaluateString, String inputS){
        int counter = 0;
        boolean y = false;
        if(EvaluateString > inputS.length()){
                EvaluateString = inputS.length();
            }
       
        for(int i=0; i<EvaluateString; i++){
             char result = inputS.charAt(i);
          
              if(result<= 'z' && result >= 'a'){
                counter++;
            } 
       
       if(counter == EvaluateString){
           y = true;
           
       }      
             
    
        }
       return y; 
        
    }
    
    
    
    
    
}// end of class