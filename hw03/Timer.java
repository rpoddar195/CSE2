// Ritika Poddar
//Hw #3
//CSE 002
//
//
//Program #1: Timer
//Objective: A program that prompts the user for the current time and dinner time 
// and calculates the amount of time remaining until they eat dinner. 

//first Import Scanner class
import java.util.Scanner;


//class
public class Timer{ 
// main method
public static void main(String[] ars) {
    
   
   //Declare Scanner
    Scanner myScanner = new Scanner ( System.in );
    
    // Set up to accept input for the current time
    System.out.print("Enter the current time (military time xxxx): ");
    int currentTime = myScanner.nextInt();
    //this accepts user input
    
    //Accept input for dinner time
    System.out.print("Enter the time that you will be eating dinner:  ");
    int dinnerTime = myScanner.nextInt();
    //accept user input
    
    //Output
    int hours, minutes;
    int timeLeft;
    
    timeLeft=dinnerTime-currentTime;
    hours=(timeLeft/100);
    minutes=(timeLeft%100);
    
    
    System.out.println("You have "+ hours + " hours and " + minutes + " minutes left until dinner.");
    
    
    
    
    
    
    
    
    
    
    
    
    }// end of main method
    
} // end of class
