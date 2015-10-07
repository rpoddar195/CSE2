/* Ritika Podddar
CSE 002
HW #6
*/

import java.util.Scanner;
import java.util.*;

public class BarGraph{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in);
      
        double monday=0;
        double tuesday=0;
        double wednesday=0;
        double thursday=0;
        double friday=0;
        double saturday=0;
        double sunday=0;
       double temp=0;
       double input2=0;
       double input3=0;
       double input4=0;
       double input5=0;
       double input6=0;
       double input7=0;
       
        
      //Input for Monday and loop to error check input
       
         boolean inputValid = false;
         while(!inputValid){
            System.out.print("Enter expenses for Monday: $");
            
            if(myScanner.hasNextDouble()||myScanner.hasNextInt()){
            temp = myScanner.nextDouble();	 
             inputValid= true;
            } else {
	                System.out.println("Sorry, you did not enter an integer. Please Try again. ");
	                myScanner.nextLine(); 
	               continue;
            }
        
        	if(temp>0){
	            	monday = temp;
	            	inputValid = true;
        	}else{
	            	System.out.println("Please only enter positive digits. Try again. ");
	                ;
        	}
       
        }  
       
        
        //Input for Tuesday and loop to error check input
            boolean inputValid2= false;
           while(!inputValid2){
                System.out.print("Enter expenses for Tuesday: $");
           
                 if(myScanner.hasNextDouble()||myScanner.hasNextInt()){
            	 input2 = myScanner.nextDouble();
                 inputValid2= true;
                     
                 } else {
	                System.out.println("Sorry, you did not enter an integer. Please Try again. ");
                    myScanner.nextLine();
                    continue;
             }
        
        	if(input2>0){
	            	tuesday = input2;
	            	inputValid2 = true;
        	}else{
	            	System.out.println("Please only enter positive digits. Try again. ");
        	}
        }
       
        
        
        //Input for Wednesday and loop to error check input
           boolean inputValid3 = false;
         while(!inputValid3){
            System.out.print("Enter expenses for Wednesday: $");
            
            if(myScanner.hasNextDouble()||myScanner.hasNextInt()){
            	 input3 = myScanner.nextDouble();
                inputValid3=true;    
             } else {
	                System.out.println("Sorry, you did not enter an integer. Please Try again. ");
                myScanner.nextLine();
                continue;
            }
        
        	if(input3>0){
	            	wednesday = input3;
	            	inputValid3 = true;
        	}else{
	            	System.out.println("Please only enter positive digits. Try again. ");
        	}
        }
        
        
        
        
        //Input for Thursday and loop to error check input
          boolean inputValid4 = false;
         while(!inputValid4){
            System.out.print("Enter expenses for Thursday: $");
           
            if(myScanner.hasNextDouble()||myScanner.hasNextInt()){
            	 input4 = myScanner.nextDouble();
                inputValid4=true;
             } else {
	                System.out.println("Sorry, you did not enter an integer. Please Try again. ");
                myScanner.nextLine();
                continue;    
                 
             }
        
        	if(input4>0){
	            	thursday = input4;
	            	inputValid4 = true;
        	}else{
	            	System.out.println("Please only enter positive digits. Try again. ");
        	}
        }
        
          
        
        //Input for Friday and loop to error check input
          boolean inputValid5 = false;
         while(!inputValid5){
            System.out.print("Enter expenses for Friday: $");
           
            if(myScanner.hasNextDouble()||myScanner.hasNextInt()){
               input5 = myScanner.nextDouble();
                inputValid5= true;
             } else {
	                System.out.println("Sorry, you did not enter an integer. Please Try again. ");
                myScanner.nextLine();
                 continue;
             }
        
        	if(input5>0){
	            	friday = input5;
	            	inputValid5 = true;
        	}else{
	            	System.out.println("Please only enter positive digits. Try again. ");
        	}
        }
        
       
        
        
        //Input for Saturday and loop to error check input
           boolean inputValid6 = false;
         while(!inputValid6){
            System.out.print("Enter expenses for Saturday: $");
            if(myScanner.hasNextDouble()||myScanner.hasNextInt()){
            	 input6 = myScanner.nextDouble();
                inputValid6=true;
             } else {
	                System.out.println("Sorry, you did not enter an integer. Please Try again. ");
                    myScanner.nextLine();
                     continue;
            }
        
        	if(input6>0){
	            	saturday = input6;
	            	inputValid6 = true;
        	}else{
	            	System.out.println("Please only enter positive digits. Try again. ");
        	}
        }
        
        
        
        
        //Input for Sunday and loop to error check input
          boolean inputValid7 = false;
         while(!inputValid7){
            System.out.print("Enter expenses for Sunday: $");
           
            if(myScanner.hasNextDouble()||myScanner.hasNextInt()){
            	 input7 = myScanner.nextDouble();
                inputValid7=true;
                
            } else {
	                System.out.println("Sorry, you did not enter an integer. Please Try again. ");
                    myScanner.nextLine();
                     continue;
            }
        
        	if(input7>0){
	            	sunday = input7;
	            	inputValid7 = true;
        	}else{
	            	System.out.println("Please only enter positive digits. Try again. ");
        	}
        }
         
       
       
        int wage=(int) Math.round(monday);
        int wage2=(int) Math.round(tuesday);
        int wage3=(int) Math.round(wednesday);
        int wage4=(int) Math.round(thursday);
        int wage5=(int) Math.round(friday);
        int wage6=(int) Math.round(saturday);
        int wage7=(int) Math.round(sunday);
        
        
         //To print out the asterix
        System.out.print("Mon:");
         for(int a=0;a<wage;a++) {
            System.out.print("*");
         }    
          
           //Print out tuesday's aterix 
          System.out.println("");
          System.out.print("Tues:");
         for(int b=0;b<wage2;b++) {
            System.out.print("*");
        }
        
            
          System.out.println("");
          System.out.print("Wed:");
         for(int c=0;c<wage3;c++) {
            System.out.print("*");
        }
        
        
          System.out.println("");
         System.out.print("Thurs:");
        for(int d=0;d<wage4;d++) {
            System.out.print("*");
        }
        
         
            System.out.println("");
          System.out.print("Fri:");
         for(int e=0;e<wage5;e++) {
            System.out.print("*");
        }
          
          
         System.out.println("");
          System.out.print("Sat:");
         for(int f=0;f<wage6;f++) {
            System.out.print("*");
        }
          
           System.out.println("");
          System.out.print("Sun:");
         for(int g=0;g<wage7;g++) {
            System.out.print("*");
        }
        
          
          
          
          //avergae
            double average;
            double estAverage;
            
            
            average=(monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7;
           
            int randomPercent = (int) (Math.random()*(41));
            
            if (randomPercent >=20){
                estAverage = (average)*(100+randomPercent-20)*0.01;
            }else {
                estAverage = (average)*(100-randomPercent)*0.01;
                
            }

            double expenseFourYear = estAverage *52*4;
        
             average = Math.round(average * 100);
             average = average/100;
             
            
            expenseFourYear=Math.round(expenseFourYear* 100);
            expenseFourYear = expenseFourYear/100;
             
            System.out.println("Your average daily expenses are: $" + average);
            System.out.println("Estimated expenditure for 4 years: $" + expenseFourYear);
   
           
   
   
   
   
   
   
   
   
    
      
      
      
      
      
        
      
        
       
       
         
        
      
     
     
     
     
     
    
  
    
    
    
    
    
    
    
    
    
    
    
    
     
        
    }
}