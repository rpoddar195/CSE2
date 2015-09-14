// Ritika Poddar
//CSE 002
//HW #3
// Program #2


//Objective:
//Program will prompt the user for the length, width, and height of a block. 
//The program will calculate the volume of the block and the surface area.

//first Import Scanner class
import java.util.Scanner;


//class
public class Block{ 
// main method
public static void main(String[] ars) {
    
   
   //Declare Scanner
    Scanner myScanner = new Scanner ( System.in );

    //Inputs
    System.out.print("Enter the legnth of the block: ");
    double blockLegnth = myScanner.nextDouble();
    
    System.out.print("Enter the width of the block: ");
    double blockWidth = myScanner.nextDouble();
    
    System.out.print("Enter the height of the block: ");
    double blockHeight = myScanner.nextDouble();
    
    
    //Outputs
    double Volume, SurfaceArea;
    
    Volume=blockLegnth*blockWidth*blockHeight;
    SurfaceArea=2*((blockLegnth*blockWidth)+(blockLegnth*blockHeight)+(blockWidth*blockHeight));
    
    System.out.print("The volume of the block with dimensions " + blockLegnth + " x " + blockWidth + 
    " x " + blockHeight + " is " + Volume + ".");
   
    System.out.print("The surface area of the block is " + SurfaceArea + ".");
    
  
  
  
   }   // end of main method
   
} //end of class