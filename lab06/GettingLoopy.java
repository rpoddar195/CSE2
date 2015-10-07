/* Ritika Poddar
CSE002
Lab #6
Getting Loopy
*/

public class GettingLoopy{
    public static void main(String[] args){
        
       
       //Step 1
       
        System.out.println("Step 1:");
        int number=1;
        int counter=6;
        while(number<7){
            System.out.print("" + number + "");
             number++;
            while(number==7 && counter<14){
                System.out.print(number);
                counter++;
             }          
            
        }
        System.out.println(" ");    
   
   //Step2: prime numbers

   int upperlimit=100;
   
   //for loop: first loop trhough the numbers one by one
    System.out.println("Step2: ");
    System.out.print("FOR LOOP: " );
   for(int primenum=10; primenum < upperlimit; primenum++) {
      boolean isPrimeNumber=true;
       
       //Check to see if each number is prime
       for(int num = 2; num < primenum; num++ ){
           if (primenum%num ==0){
               isPrimeNumber = false;
            break;    
           }
       }
   
       //print the prime numbers
       if(isPrimeNumber){
           System.out.print(" " + primenum + " ");
       }
   }
   System.out.println("");
   
   
   //while loop: loop though each of the numbers
   System.out.print("WHILE LOOP: ");
  
   int primenum = 10;
   while(primenum < upperlimit) {
       
         boolean isPrimeNumber = true;
         primenum++;
         
         
       int num=2;
       while(num < primenum){
           if (primenum%num == 0){
               isPrimeNumber = false;
           }
           num++;
           
       }
       
        //print the prime numbers
       if(isPrimeNumber){
           System.out.print(" " + primenum + " ");
       }
     
   }
    System.out.println("");
   
   
   
   //do while loop
   
  System.out.print("DO WHILE LOOP: " );
   do{ 
       boolean isPrimeNumber = true;
       
       int num=2;
       if(isPrimeNumber){
       System.out.print(" " + primenum + " ");
       }
       
       do{if (primenum%num == 0){
               isPrimeNumber = false;
           }
        num++;   
        }   
        while(num < primenum);
       
      
     primenum++;
   }
   while(primenum < upperlimit); 
    
 
   System.out.println("");
   System.out.println("Step 3:");
        int upperbound=10;
        int basenum=10;
        int randomnum= (int) (Math.random()*(upperbound+1)) + basenum;

        if( randomnum < 20) {
        for( int a = 0; a< randomnum; a++) {
            System.out.print(":)");
        }
            
    }

        if(randomnum > 20) {

            for(int b = 0; b< randomnum/20; b++) {
                System.out.println(" ");
                for (int c= 0; c<20; c++) {
                    System.out.print(":)");
                }

            }
        }

      
  
   
   
   
  
    
        
        
        
        
    }
}