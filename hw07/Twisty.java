import java.util.Scanner;
import java.util.*;

public class Twisty{
    public static void main(String[] args){
        
        
        Scanner myScanner = new Scanner (System.in);
        
      
        boolean acceptablelength= false;
        double mylength = 0.0;

        //loop until you get valid input 
        System.out.print("Please enter your length: ");
        while( !acceptablelength ){

        //check if the input is a int.
        if (myScanner.hasNextDouble() ){
          mylength = myScanner.nextDouble();  //if so, store it.
          acceptablelength = true;
        } else {
            System.out.println("ERROR: input is not an double.");
            System.out.print("Please enter your length:  ");
            myScanner.next();
            continue;
        }
        
        if(mylength>80){
            System.out.println("ERROR: input is too long.");
            System.out.print("Please enter length shorter than 80: ");
            myScanner.next();
        }
        
        
        }
        
        
        
        boolean acceptablewidth= false;
        double mywidth = 0.0;
        
        
         System.out.print("Please enter your width: ");
        while( !acceptablewidth ){

        //check if the input is a int.
        if (myScanner.hasNextDouble() ){
          mywidth = myScanner.nextDouble();  //if so, store it.
          acceptablewidth = true;
        } else {
            System.out.println("ERROR: input is not an double.");
            System.out.print("Please enter your width:  ");
            myScanner.next();
            continue;
             }
        
       if(mywidth > mylength){
           System.out.println("ERROR: width is too long.");
           System.out.print("Please enter a width shorter than the length: ");
           myScanner.next();
           
       }
       
       
        }
        
      



        //loop for x design
        
    
       
    
       // for(int a = 1; a <= (int) (mylength/7); a++ ){
           
            for(int i = 0; i < mywidth; i++){   ///loop for printing out each line vertically
                
                for(int j = 0; j< mylength; j++){  //loop for printing out each character horizantally
                    
             
                if(i==j%mywidth){
                  
                   if( (int) (j /mywidth)%2 ==0){ 
                
                     System.out.print("#");
                        
                } else {
                    System.out.print("\\");
                    
                   } 
                     
                }
             else if((j%mywidth)==mywidth-i-1) {
                  
                  if( (int) (j/mywidth)%2 ==0){
                    System.out.print("/");
                    
                   } else {
                    System.out.print("#");
                     }
                   
               } 
               
              else{
                  System.out.print(" ");
              }  
                 
        
           
        }   
    
     System.out.println(""); 
      }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
                
    }
}