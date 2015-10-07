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
          
        
        
        
        
        
         
     /*  int check;  
               int num1=Isbn/1000000000;
                int num2=I(sbn/100000000)%10;
                int num3=(Isbn/10000000)%10;
                int num4=(Isbn/1000000)%10;
                int num5=(Isbn/100000)%10;
                int num6=(Isbn/10000)%10;
                int num7=(Isbn/1000)%10;
                int num8=(Isbn/100)%10;
                int num9=(Isbn/10)%10;
                int num10=Isbn%10;    
            
           // for(int a=10, a>0, a--){
                for(some condition for num1-10){
                    numX/a++
                }
            }   
              char num1=(Isbn.CharAt(1));
           char num2=(Isbn.CharAt(2));
           char num3=(Isbn.CharAt(3));
           char num4=(Isbn.CharAt(4));
           char num5=(Isbn.CharAt(5));
           char num6=(Isbn.CharAt(6));
           char num7=(Isbn.CharAt(7));
           char num8=(Isbn.CharAt(8));
           char num9=(Isbn.CharAt(9));
            char numX=(Isbn.CharAt(10)); 
             
             
             */  
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}