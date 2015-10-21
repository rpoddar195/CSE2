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
    
    //While loop to check if input is a string
      while(!acceptable){
          if(myinput.hasNextLine()) {
            acceptable = true;
            inputS = myinput.nextLine();   //if it is then the program saves the input
            
              
          } else{
              System.out.println("ERROR: not a string input.");   //if not then this error comes up and asks user to have another input
              System.out.println("Please enter a string:  ");
              myinput.next();
              
          }
          
          
      }
      
      
      //now input how much to evaluate
       System.out.println(" How much of the input do you want to evaluate? Please enter a number or put all: ");
      
       boolean Stringindex = false;
       
       //if they put in a number for number of characters we use the method that supports both string and int
       if(myinput.hasNextInt()){
           int EvaluateString = myinput.nextInt();
          Stringindex = myMethod(EvaluateString, inputS);//calling method
       
       }
      
     //if they put in all we go straight to the method for string and evaluate every single character
      else if (myinput.hasNextLine())
       {  String EvaluateS = myinput.next();
         Stringindex = myMethod(inputS);//calling the method
       }
      
       //when the result comes back, if it equals true that means all evaluated charcters were letter
        if( Stringindex == true){
           System.out.println("Characters are all letters.");
      
      //if the result equals false then the evaluated characters were not letters     
       } else if (Stringindex == false){
           System.out.println("All characters are not letters.");
       }
       
       
        
        
        
        
        
    }// end of main method
    
    //method for evaluating a string when the user wants all of it evaluated
    public static boolean myMethod(String inputS){
       int counter = 0;
       boolean x = false;
     //use a for loop to increase i until all the characters in string have been evaluated
       for (int i=0; i< inputS.length(); i++){
       char result = inputS.charAt(i);
            
           //if the result charcter is a letter then the counter increases
            if(result<= 'z' && result >= 'a'){
                counter++;
                
            } else if(result == ' '){
                counter++;
            }
        
       }
       
       //if the counter for letters equals how many charcters were in the string, all the characters are letter
       if(counter == inputS.length()){
          x= true;
          
       }
       
       return x;  //returns true to the main method
        
    }
    
   //method for evaluating string then the user enters a number for how many characters to evaluate 
    public static boolean myMethod(int EvaluateString, String inputS){
        int counter = 0;
        boolean y = false;
      //if the number they entered is more than the length of the string, we just evaluate the whole string and stop after that
        if(EvaluateString > inputS.length()){
                EvaluateString = inputS.length();
            }
       //otherwise we use the same loop as above to evaluate each individual character
        for(int i=0; i<EvaluateString; i++){
             char result = inputS.charAt(i);
          
              if(result<= 'z' && result >= 'a'){
                counter++; // counter increase everytime a letter is evaluated
            } 
            else if(result == ' '){
                counter++;
            }
       
        }
       if(counter == EvaluateString){
           y = true; 
           
       }      
             
    
       return y; //return true or false to main method
        
    }
    
    
    
    
    
}// end of class