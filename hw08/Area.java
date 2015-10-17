/* Ritika Poddar
CSE 002
HW #8
*/

import java.util.Scanner;
import java.util.*;

public class Area {
    
    public static void main (String [] args){
        
        Scanner scanner = new Scanner (System.in);
      
        String circle = "circle";
        String triangle = "triangle";
        String rectangle = "rectangle";
        
       boolean acceptable = false;
       System.out.println("Please choose circle, triangle, or rectangle: ");
      
       while(!acceptable){
       String choice = scanner.next();
      
       double radius = 0.0;
        if(choice.equals(circle)){
               acceptable = true;
               boolean validinput = false;
               
                System.out.println("Enter radius: ");
                while(!validinput){
                if (scanner.hasNextDouble() ){
                    radius = scanner.nextDouble();  //if so, store it.
                    validinput = true;
                    double AreaofCircle = CircleArea(radius);
                    System.out.println("Area = " + AreaofCircle);
                } else {
                    System.out.println("ERROR: input is not an double.");
                    System.out.print("Please enter your radius:  ");
                    scanner.next();
                }
                }
               
        }
         
         
       
       
         else if(choice.equals(triangle)){
               acceptable = true;
               double length = 0.0;
               double height = 0.0;
               boolean validinput = false;
               boolean validinput2 = false;
               
                System.out.println("Enter length: ");
                while(!validinput){
                 if (scanner.hasNextDouble() ){
                    length = scanner.nextDouble();//if so, store it.
                    validinput = true;
                   
                    System.out.println("Enter height: ");
                      while(!validinput2){
                      if (scanner.hasNextDouble() ){
                      height = scanner.nextDouble();  //if so, store it.
                      validinput2 = true;
                          
                      } else {
                        System.out.println("ERROR: input is not an double.");
                        System.out.print("Please enter your height:  ");
                        scanner.next();
                      }
                      }
                
               
                } else {
                    System.out.println("ERROR: input is not an double.");
                    System.out.print("Please enter your length:  ");
                    scanner.next();
                }
                
                }  
                
                 double AreaofTriangle = TriangleArea(length, height);
                 System.out.println("Area = " + AreaofTriangle);
        
         }  
         
         
        
         
         else if(choice.equals(rectangle)){
             acceptable = true;
             double length2 = 0.0;
             double width = 0.0;   
             boolean validinput=false;
             boolean validinput2 = false;  
             
                System.out.println("Enter length: ");
                while(!validinput) {
                 if (scanner.hasNextDouble() ){
                    length2 = scanner.nextDouble();//if so, store it.
                    validinput = true;
        
                    System.out.println("Enter width: ");
                    while(!validinput2){
                      if (scanner.hasNextDouble() ){
                      width = scanner.nextDouble();  //if so, store it.
                      validinput2=true;
                      } else {
                        System.out.println("ERROR: input is not an double.");
                        System.out.print("Please enter your width:  ");
                        scanner.next();
                      }
                    }
                  
                
                
                 } else {
                    System.out.println("ERROR: input is not an double.");
                    System.out.print("Please enter your length:  ");
                    scanner.next();
                }
               
                }
                  
                  double AreaofRec = RecArea(length2, width);
                  System.out.println("Area = "+ AreaofRec);  
            }
          
          
          
          
          
          
           else{ 
            System.out.println("That is an invalid shape.");
            System.out.println("Please enter either a circle, triangle, or rectangle (all lowercase): ");
            //scanner.next();
        }
       
           
       }// end of while loop 
        
    }// end of main method
    
     public static double CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
 
    public static double TriangleArea(double length, double height) {
        double area = (length * height)/2;
        return area;
    }
 
    public static double RecArea(double length2, double width) {
        double area = length2 * width;
        return area;
    }
        
        
        
        
        
        
        
        
        
        
        
    
    
    } 
    
