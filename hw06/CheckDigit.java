/* Ritika Poddar
CSE 002
HW #6
Check Digit
*/

import java.util.Scanner;

public class CheckDigit{
    public static void main(String[] args){
        
        
       Scanner input=new Scanner(System.in);
      
        boolean Isbnvalid=true;
        String Isbn;
        int digit;
        String checksum="";
     
     
       do{
       System.out.println("Please enter a ten digit barcode:   ");
       Isbn = input.nextLine();
          
           if(Isbn.length()!=10){
               System.out.print("This is NOT a valid ISBN. ");
            Isbnvalid=false;
            continue;
        
           }else{
               Isbnvalid = true;
           }
      
       }while(!Isbnvalid);
      
       if(Isbn.length()==10){
           int tot = 0;
            for ( int i = 0; i < 9; i++ )
            {
            digit = Integer.parseInt( Isbn.substring( i, i + 1 ) );
                tot += ((10 - i) * digit);
            }

            checksum = Integer.toString( (11 - (tot % 11)) % 11 );
            if ( "10".equals( checksum ) ){
                checksum = "X";
            }
          }  
       
       boolean checkvalid=(checksum.equals( Isbn.substring( 9 ) ));
        if(checkvalid==false){
                System.out.println("This is NOT a valid ISBN. Check digit should be " + checksum);
            }else if(checkvalid==true){
                System.out.println("This is a valid ISBN.");
            }
          
        
        
        
        
        
   
        
        
        
        
        
        
        
    }
    
    
}