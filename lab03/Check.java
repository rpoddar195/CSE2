//Ritika Poddar
//CSE 002
//lab 03
// Objective: This lab will obtain from the user the original cost of the check, 
// the percentage tip they wish to pay, 
// and the number of ways the check will be split.
// Then it will determine how much each person in the group needs to spend 
// in order to pay the check.

import java.util.Scanner;   // to import Scanner class, only thing ever outside the class

//class and main method
//
//class
public class Check{
    // main method
    public static void main(String[] args) {
        
        
   //in order to accept input, first declare an instance of the Scanner object 
   //and call the Scanner constructor.
   //This following command will construct the instance of the Scanner declared,
   //it tells Scanner that you are creating an instance 
   //that will take input from STDIN.
        
    Scanner myScanner = new Scanner ( System.in );
    
    //Now ready to accept input
      
     System.out.print("Enter the orginal cost of the check in the form xx.xx: ");
     
     double checkCost = myScanner.nextDouble();
     //this accepts user input
     
      System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
      double tipPercent = myScanner.nextDouble();
      tipPercent /= 100;  //We want to convert the percentage into a decimal value
      
      // prompt the user for the number of people that went out to dinner and accept input
      
      System.out.print("Enter the number of people who went out to dinner: ");
      int numPeople = myScanner.nextInt ();
      
      //Now we have all the inputs. 
      //Output the amount that each memeber of the groups needs to spend
      //in order to pay the check.
    
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies; //whole dollar amount of cost of dimes, pennies; 
                                    // for storing digits
                                    // to the right of the decimal point
                                 //for the cost$
        totalCost = checkCost*(1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping the decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount,
        // for example (int)(6.73*10) % 10 -->67 % 10 -->7
        //where the % (mod) operator returns the remainder
        // after the division: 583%100 -> 83, 27%5 -> 2 
        
        dimes=(int) (costPerPerson * 10) % 10;
        pennies=(int) (costPerPerson * 100) % 10;
        System.out.print("Each person in the group owes $" + dollars + "." + dimes + pennies);
        
        
        
        
        
        
    }  // end of main method
    
    
} // end of class