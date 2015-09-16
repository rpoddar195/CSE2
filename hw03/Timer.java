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
    int hours, minutes, dinnermin, dinnerhours;
    int currentmin, currenthours, timeleftmin, timelefthours ;
    
    dinnermin=(dinnerTime%100);  //minutes value from the dinner time
    currentmin=(currentTime%100);  //minutes value from the current time
    
    dinnerhours=(dinnerTime/100);  //hours value from dinner time
    currenthours=(currentTime/100); //hours value from the current time
    
    timeleftmin=dinnermin-currentmin;  //minutes left
    timelefthours=dinnerhours-currenthours;  //hours left
    
    if(currentmin>dinnermin)   //if the current time's minute value is left the dinner time's minute value, this will adjust it.
    {minutes=timeleftmin+60;
    hours=timelefthours-1;}
    else {minutes=timeleftmin;
          hours=timelefthours;}
    
    
    
    System.out.println("You have "+ hours + " hours and " + minutes + " minutes left until dinner.");
    
    
    
    
    
    
    
    
    
    
    
    
    }// end of main method
    
} // end of class
