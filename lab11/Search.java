/* Ritika Poddar
Lab#11
*/

import java.util.Scanner;

public class Search{
    
    public static void main(String[] args){
        
        //Two integer arrays of size 5000
        int[] array1 = new int[5000];
        int[] array2 = new int[5000];
        
        
        //Fill array1 with random integers between 0 and 100000
         for(int i =0; i<5000; i++){
               int x = (int) (Math.random()*100000);
               array1[i] = x;
         }
        
    //Use linear search to print out the minimum and maximum values of array1
        
       
        int min1 = 100000;
        for(int j =0; j<5000; j++){
            if( array1[j]< min1){
                min1 = array1[j];
            }  
        }
        
        System.out.println("The min of array1 is: " + min1);
       
       
       int max1 = 0;
        for(int j =0; j<5000; j++){
            if( array1[j]> max1){
                max1 = array1[j];
            }  
        }
       
        System.out.println("The max of array1 is: " + max1);
        
        
        
        
        
        // add increasingly random numbers to array2
        
        for(int i =0; i<5000; i++){
            int y = (int) (Math.random()*100000);
                 if(i==0){
                 array2[i] = y; 
                 }
                 else if(i>0){
                     if(y > array2[i-1]){
                    array2[i] = y; 
                 }
                 
                 
        }  
        
        }
            /*if(i>0){ 
            int number = array2[i];
            if(array2[i-1]> array2[i]){
                array2[i] = array2 [i-1];
                array2[i-1] = number;
            }
            } */  
        
        
        
        //max and min
        int min = array2[0];
        int max = array2[4999];
       
        System.out.println("The max of array2 is: " + max);
       
         System.out.println("The min of array2 is: "+ min);
        
        
        // user input
        
        
        
        System.out.println("Enter an int: ");
        Scanner myinput = new Scanner (System.in);
        int userinput = myinput.nextInt();
        
        int minimum = 0;
        int maximum = array2.length-1;
        
        boolean foundit = false;
      

        if( userinput >=0){
          
            while(maximum > minimum ){
           
            if((array2.length/2) == userinput){
                System.out.println(userinput + "was found in the list.");
                foundit = true;
                
            }
            else if((array2.length/2)> userinput){
                maximum = array2.length/2;
            }
            else if((array2.length/2)< userinput ){
                minimum = array2.length/2;
                
            }
            
            } 
            
            if(foundit = false){
                System.out.println(userinput + "was not found in the list.");
                if( userinput > max){
                System.out.println("The number above the key was none");
               } else {
                 System.out.println( "The number above the key was" + maximum);
               }
               
               if(userinput < min){
                System.out.println("The number above the key was none");   
               }else{
                System.out.println("The number below the key was" + minimum);
            }
            
            
        }
        
        }
        
        
        
        
        
        
        
    } //end of main method
    
    
    
    
    
}// end of main class