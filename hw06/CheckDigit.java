/* Ritika Poddar
CSE 002
HW #6
Check Digit
*/

import java.util.Scanner;

public class CheckDigit{
    public static void main(String[] args){
        
        
       Scanner input=new Scanner(System.in);
      //decalre variables
        boolean Isbnvalid=true;
        String Isbn;
        int digit;
        String checksum="";
     
     
       do{  //do while loop to check if the digit is inputed correctly
       System.out.println("Please enter a ten digit barcode:   ");  
       Isbn = input.nextLine();
          
           if(Isbn.length()!=10){                                //check how long the input is
               System.out.print("This is NOT a valid ISBN. ");  //if input not ten digits long this message pops up
            Isbnvalid=false;
            continue;
        
           }else{
               Isbnvalid = true;       //otheriwse its fine
           }
      
       }while(!Isbnvalid);
      
       if(Isbn.length()==10){
           int tot = 0;
            for ( int i = 0; i < 9; i++ )
            {
            digit = Integer.parseInt( Isbn.substring( i, i + 1 ) );   //calculating the check sum
                tot += ((10 - i) * digit);
            }

            checksum = Integer.toString( (11 - (tot % 11)) % 11 );  //adding X to represent 10 in the ISBN code.
            if ( "10".equals( checksum ) ){             
                checksum = "X";
            }
          }  
       
       boolean checkvalid=(checksum.equals( Isbn.substring( 9 ) ));  //seeing if checksum=the last digit in the input
        if(checkvalid==false){
                System.out.println("This is NOT a valid ISBN. Check digit should be " + checksum);  //prints if the ISBN code is wrong
            }else if(checkvalid==true){
                System.out.println("This is a valid ISBN.");  //prints if it is a valid code.
            }
          
        
        
        
        
        
   
        
        
        
        
        
        
        
    }
    
    
}