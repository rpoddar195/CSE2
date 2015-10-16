/* Ritika Poddar
CSE 002
Lab #8 */

import java.util.*;
import java.util.Scanner;

public class Stats {
    
    
    public static void main(String[] args){
        
        
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please print out your first digit: ");
       double firstdigit = input.nextDouble();
       
      
       
        boolean acceptable = false;
        double seconddigit =0.0;
        
        //loop until you get valid input 
        System.out.println("Please print out your second digit: ");
        while( !acceptable ){
        //check if the input is larger than the first input
         seconddigit = input.nextDouble();
        if (seconddigit > firstdigit){
          acceptable = true; //if so store it
        } else {
            System.out.println("ERROR: input is not bigger than first digit.");
            System.out.print("Please print out your second digit:  ");
           // input.next();
        }
        
        }
      
       
       double thirddigit = 0.0;
       acceptable = false;
       System.out.println("Please print out your third digit: ");
        while( !acceptable ){
        //check if the input is larger than the previous input
        thirddigit = input.nextDouble();
        if (thirddigit > seconddigit){
          acceptable = true; //if so store it
        } else {
            System.out.println("ERROR: input is not bigger than second digit.");
            System.out.print("Please print out your third digit:  ");
           
        }
        
        } 
      
      
      double fourthdigit = 0.0;
      acceptable = false;
       System.out.println("Please print out your fourth digit: ");
         while( !acceptable ){
        //check if the input is larger than the previous input
        fourthdigit = input.nextDouble();
        if (fourthdigit > thirddigit){
          acceptable = true; //if so store it
        } else {
            System.out.println("ERROR: input is not bigger than third digit.");
            System.out.print("Please print out your fourth digit:  ");
           
        }
        
        }
       
       double fifthdigit = 0.0;
       acceptable = false;
       System.out.println("Please print out your fifth digit: ");
         while( !acceptable ){
        //check if the input is larger than the previous input
        fifthdigit = input.nextDouble();
        if (fifthdigit > fourthdigit){
          acceptable = true; //if so store it
        } else {
            System.out.println("ERROR: input is not bigger than fourth digit.");
            System.out.print("Please print out your fifth digit:  ");
           
        }
        
        }
       
       
        
        
    
        
    double median = findMedianofDigits(firstdigit, seconddigit,  thirddigit, fourthdigit,  fifthdigit);
    double mean = findMeanofDigits( firstdigit,  seconddigit,  thirddigit,  fourthdigit,  fifthdigit);
    Print( thirddigit,  mean);
        
        
        
        
        
    }// end of main method
    
    
      public static double findMedianofDigits( double firstdigit, double seconddigit, double thirddigit, double fourthdigit, double fifthdigit ){
        double median = thirddigit;       
        return median;
         
     }
        
      public static double findMeanofDigits(double firstdigit, double seconddigit, double thirddigit, double fourthdigit, double fifthdigit ){
         double mean = (firstdigit+ seconddigit + thirddigit+ fourthdigit + fifthdigit)/5;
         return mean;
     }
        
        
       public static void Print(double thirddigit, double mean){
           System.out.println(" The median is " + thirddigit + " and the mean is " + mean );
       } 
   
    
    
    
    
    
    
    
}