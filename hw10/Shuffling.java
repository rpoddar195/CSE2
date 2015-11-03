/* Ritika Poddar
CSE 002
HW# 10
*/

import java.util.Scanner;
import java.util.*;

public class Shuffling{
 
  public static void main(String[] args) {
   
     Scanner scan = new Scanner(System.in);

	//arrays for suits and identities: club, heart, spade or diamond
        String[] suitNames= {"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        
       // arrays for number of cards and user's hand 
        String[] cards = new String[52];
        String[] hand = new String[5];
    
        for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];  // creating the array cards to represent all the cards
        System.out.print(cards[i]+" ");   // print out the whole deck
        }

          shuffle(cards); 
          printArray(cards);
          
          randomizeHand(cards, hand);
          printHand(hand);

      
      
      
      
  }



        public static void printArray( String [] cards){
          System.out.println("Shuffled: ");
          
          for (int i = 0; i < 52; i++) {
            System.out.print(cards[i] + " ");  // print out the chuffled cards
        }    
            
        }
        
         public static void printHand( String [] hand){
          System.out.println("Randomized Hand! ");
          
          for (int i = 0; i < 5; i++) {
            System.out.print(hand[i] + " ");   // print out the hand of 5 cards
        }    
            
        }
        
        public static void shuffle( String[] cards){
         
           for(int i = 0; i<52; i++){   
            String firstcard = cards[0];
            int x = (int) (Math.random()*52); // shuffle the cards with a random number each time
            cards[0] = cards [x];
            cards [x] = firstcard;
      
        }
        
        }
     
     
      public static void randomizeHand( String [] cards, String [] hand){
         int[] myArray= new int[5];
         
         
         for(int j =0; j<5; j++){
               int x = (int) (Math.random()*52);
               myArray[j] = x;   //create a new array with random five numbers
             
             if(j==0){
                    hand[j] = cards[myArray[j]];  // if there aren't any repeats in the numbers than use it to refernce an element in cards
                }                               // then add that element to the array hands
              
             else if(j>0){
               if(x != myArray[j-1]){
                hand[j] = cards[myArray[j]];
                } 
             }
               
         }
       
            
     }
     
     
     
     
        
}// end of class