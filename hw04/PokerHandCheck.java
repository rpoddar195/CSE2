//Ritika Poddar
//hw #4
//CSE2
// Poker Hand Check


public class PokerHandCheck{
    //main method 
    public static void main(String [] args) {
        
    int min, max;
    min=1;
    max=52;
    int Cardnumber= (int)(Math.random()*(max+1))+min;
    
    String Suit="";
    String Cardidentity="";
    
    //if statements to assign suit name
    if(Cardnumber>= 1 && Cardnumber <=13){
        Suit="Diamonds";
     }
     else if(Cardnumber>= 14 && Cardnumber <=26){
         Suit="Clubs";
     }   
     else if(Cardnumber>= 27 && Cardnumber <=39){
         Suit="Hearts"; 
     }
     else if (Cardnumber>= 40 && Cardnumber <=52){
         Suit="Spades";
     }
     
     //Switch for indentity of card
     switch (Cardnumber%13){
        case 0:
        Cardidentity="Ace";
        break;
        
        case 1:
        Cardidentity="2";
        break;
        
        case 2:
        Cardidentity="3";
        break;
        
        case 3:
        Cardidentity="4";
        break;
        
        case 4:
        Cardidentity="5";
        break;
        
        case 5:
        Cardidentity="6";
        break;
        
        case 6:
        Cardidentity="7";
        break;
        
        case 7:
        Cardidentity="8";
        break;
        
        case 8:
        Cardidentity="9";
        break;
        
        case 9:
        Cardidentity="10";
        break;
        
        case 10:
        Cardidentity="Jack";
        break;
        
        case 11:
        Cardidentity="Queen";
        break;
        
        case 12:
        Cardidentity="King";
        break;
      }
     
    //2nd random card
    int Cardnumber2= (int)(Math.random()*(max+1))+min;
  
    String Suit2="";
    String Cardidentity2="";
    
    //if statements to assign suit name
    if(Cardnumber2>= 1 && Cardnumber2 <=13){
        Suit2="Diamonds";
     }
     else if(Cardnumber2>= 14 && Cardnumber2 <=26){
         Suit2="Clubs";
     }   
     else if(Cardnumber2>= 27 && Cardnumber2 <=39){
         Suit2="Hearts"; 
     }
     else if (Cardnumber2>= 40 && Cardnumber2 <=52){
         Suit2="Spades";
     }
     
     //Switch for indentity of card
     switch (Cardnumber2%13){
        case 0:
        Cardidentity2="Ace";
        break;
        
        case 1:
        Cardidentity2="2";
        break;
        
        case 2:
        Cardidentity2="3";
        break;
        
        case 3:
        Cardidentity2="4";
        break;
        
        case 4:
        Cardidentity2="5";
        break;
        
        case 5:
        Cardidentity2="6";
        break;
        
        case 6:
        Cardidentity2="7";
        break;
        
        case 7:
        Cardidentity2="8";
        break;
        
        case 8:
        Cardidentity2="9";
        break;
        
        case 9:
        Cardidentity2="10";
        break;
        
        case 10:
        Cardidentity2="Jack";
        break;
        
        case 11:
        Cardidentity2="Queen";
        break;
        
        case 12:
        Cardidentity2="King";
        break;
     }
    
    
    //3rd random card
    int Cardnumber3= (int)(Math.random()*(max+1))+min;
    String Suit3="";
    String Cardidentity3="";
  
    //if statements to assign suit name
    if(Cardnumber3>= 1 && Cardnumber3 <=13){
        Suit3="Diamonds";
     }
     else if(Cardnumber3>= 14 && Cardnumber3 <=26){
         Suit3="Clubs";
     }   
     else if(Cardnumber3>= 27 && Cardnumber3 <=39){
         Suit3="Hearts"; 
     }
     else if (Cardnumber3>= 40 && Cardnumber3 <=52){
         Suit3="Spades";
     }
     
     //Switch for indentity of card
     switch (Cardnumber3%13){
        case 0:
        Cardidentity3="Ace";
        break;
        
        case 1:
        Cardidentity3="2";
        break;
        
        case 2:
        Cardidentity3="3";
        break;
        
        case 3:
        Cardidentity3="4";
        break;
        
        case 4:
        Cardidentity3="5";
        break;
        
        case 5:
        Cardidentity3="6";
        break;
        
        case 6:
        Cardidentity3="7";
        break;
        
        case 7:
        Cardidentity3="8";
        break;
        
        case 8:
        Cardidentity3="9";
        break;
        
        case 9:
        Cardidentity3="10";
        break;
        
        case 10:
        Cardidentity3="Jack";
        break;
        
        case 11:
        Cardidentity3="Queen";
        break;
        
        case 12:
        Cardidentity3="King";
        break;
     }
     
     
     
    //4th random card 
     int Cardnumber4= (int)(Math.random()*(max+1))+min;
    String Suit4="";
    String Cardidentity4="";
    
    //if statements to assign suit name
    if(Cardnumber4>= 1 && Cardnumber4 <=13){
        Suit4="Diamonds";
     }
     else if(Cardnumber4>= 14 && Cardnumber4 <=26){
         Suit4="Clubs";
     }   
     else if(Cardnumber4>= 27 && Cardnumber4 <=39){
         Suit4="Hearts"; 
     }
     else if (Cardnumber4>= 40 && Cardnumber4 <=52){
         Suit4="Spades";
     }
     
     //Switch for indentity of card
     switch (Cardnumber4%13){
        case 0:
        Cardidentity4="Ace";
        break;
        
        case 1:
        Cardidentity4="2";
        break;
        
        case 2:
        Cardidentity4="3";
        break;
        
        case 3:
        Cardidentity4="4";
        break;
        
        case 4:
        Cardidentity4="5";
        break;
        
        case 5:
        Cardidentity4="6";
        break;
        
        case 6:
        Cardidentity4="7";
        break;
        
        case 7:
        Cardidentity4="8";
        break;
        
        case 8:
        Cardidentity4="9";
        break;
        
        case 9:
        Cardidentity4="10";
        break;
        
        case 10:
        Cardidentity4="Jack";
        break;
        
        case 11:
        Cardidentity4="Queen";
        break;
        
        case 12:
        Cardidentity4="King";
        break;
     }
     
     
     //5th random card, suit and cardidentity
     int Cardnumber5= (int)(Math.random()*(max+1))+min;
    String Suit5="";
    String Cardidentity5=" ";
    
    //if statements to assign suit name
    if(Cardnumber5>= 1 && Cardnumber5 <=13){
        Suit5="Diamonds";
     }
     else if(Cardnumber5>= 14 && Cardnumber5 <=26){
         Suit5="Clubs";
     }   
     else if(Cardnumber5>= 27 && Cardnumber5<=39){
         Suit5="Hearts"; 
     }
     else if (Cardnumber5>= 40 && Cardnumber5 <=52){
         Suit5="Spades";
     }
     
     //Switch for indentity of card
     switch (Cardnumber5%13){
        case 0:
        Cardidentity5="Ace";
        break;
        
        case 1:
        Cardidentity5="2";
        break;
        
        case 2:
        Cardidentity5="3";
        break;
        
        case 3:
        Cardidentity5="4";
        break;
        
        case 4:
        Cardidentity5="5";
        break;
        
        case 5:
        Cardidentity5="6";
        break;
        
        case 6:
        Cardidentity5="7";
        break;
        
        case 7:
        Cardidentity5="8";
        break;
        
        case 8:
        Cardidentity5="9";
        break;
        
        case 9:
        Cardidentity5="10";
        break;
        
        case 10:
        Cardidentity5="Jack";
        break;
        
        case 11:
        Cardidentity5="Queen";
        break;
        
        case 12:
        Cardidentity5="King";
        break;
     }
    
    
 //Print out the five random cards.
     System.out.println("Your random cards are: ");
     System.out.println("The " + Cardidentity + " of " + Suit + ".");
     System.out.println("The " + Cardidentity2 + " of " + Suit2 + ".");
     System.out.println("The " + Cardidentity3 + " of " + Suit3 + ".");
     System.out.println("The " + Cardidentity4 + " of " + Suit4 + ".");
     System.out.println("The " + Cardidentity5 + " of " + Suit5 + ".");
  
   //To find two pairs, if else statements running through each combination fo two pairs. 
   if(Cardidentity.equals(Cardidentity2) && Cardidentity3.equals(Cardidentity4)){
       System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity2) && Cardidentity3.equals(Cardidentity5)){
      System.out.println("You have a two pair!"); 
   }else if(Cardidentity.equals(Cardidentity2) && Cardidentity4.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity3) && Cardidentity2.equals(Cardidentity4)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity3) && Cardidentity2.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity3) && Cardidentity4.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity4) && Cardidentity2.equals(Cardidentity3)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity4) && Cardidentity3.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity4) && Cardidentity2.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity5) && Cardidentity2.equals(Cardidentity3)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity5) && Cardidentity2.equals(Cardidentity4)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity.equals(Cardidentity5) && Cardidentity3.equals(Cardidentity4)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity2.equals(Cardidentity3) && Cardidentity.equals(Cardidentity4)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity2.equals(Cardidentity3) && Cardidentity4.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity2.equals(Cardidentity3) && Cardidentity.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity2.equals(Cardidentity4) && Cardidentity3.equals(Cardidentity)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity2.equals(Cardidentity4) && Cardidentity3.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity2.equals(Cardidentity4) && Cardidentity.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity2.equals(Cardidentity5) && Cardidentity.equals(Cardidentity3)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity2.equals(Cardidentity5) && Cardidentity3.equals(Cardidentity4)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity2.equals(Cardidentity5) && Cardidentity.equals(Cardidentity4)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity3.equals(Cardidentity4) && Cardidentity.equals(Cardidentity2)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity3.equals(Cardidentity4) && Cardidentity2.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity3.equals(Cardidentity4) && Cardidentity.equals(Cardidentity5)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity3.equals(Cardidentity5) && Cardidentity.equals(Cardidentity2)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity3.equals(Cardidentity5) && Cardidentity2.equals(Cardidentity4)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity3.equals(Cardidentity5) && Cardidentity.equals(Cardidentity4)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity4.equals(Cardidentity5) && Cardidentity.equals(Cardidentity2)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity4.equals(Cardidentity5) && Cardidentity2.equals(Cardidentity3)){
      System.out.println("You have a two pair!");
   }else if(Cardidentity4.equals(Cardidentity5) && Cardidentity.equals(Cardidentity3)){
      System.out.println("You have a two pair!");
   }
     
   //to find three of same, if else statments for every combination of three of the same.
   if(Cardidentity.equals(Cardidentity2) && Cardidentity.equals(Cardidentity3)){
        System.out.println("You have a three of the same!");
    } else if(Cardidentity.equals(Cardidentity2) && Cardidentity.equals(Cardidentity4 )){
        System.out.println("You have a three of the same!");
    } else if(Cardidentity.equals(Cardidentity2) && Cardidentity.equals(Cardidentity5)) {
        System.out.println("You have a three of the same!");
    } else if(Cardidentity.equals(Cardidentity3) && Cardidentity.equals(Cardidentity4 )) {
        System.out.println("You have a three of the same!");
    } else if(Cardidentity.equals(Cardidentity3) && Cardidentity.equals(Cardidentity5)){
        System.out.println("You have a three of the same!");
    } else if(Cardidentity.equals(Cardidentity4) && Cardidentity.equals(Cardidentity5)) {
        System.out.println("You have a three of the same!");
    } else if(Cardidentity2.equals(Cardidentity3) && Cardidentity2.equals(Cardidentity4 )) {
        System.out.println("You have a three of the same!");
    } else if(Cardidentity2.equals(Cardidentity3) && Cardidentity2.equals(Cardidentity5)) {
        System.out.println("You have a three of the same!");
    } else if(Cardidentity2.equals(Cardidentity4) && Cardidentity2.equals(Cardidentity5)) {
        System.out.println("You have a three of the same!");
    } else if(Cardidentity3.equals(Cardidentity4)  && Cardidentity3.equals(Cardidentity5)) {
        System.out.println("You have a three of the same!");
    } 
   
      
    //to find a pair, if else statments for every combination of a pair.
   if(Cardidentity.equals(Cardidentity2)){
       System.out.println("You have a pair!");
   } else if(Cardidentity.equals(Cardidentity3)){
       System.out.println("You have a pair!");
   } else if(Cardidentity.equals(Cardidentity4)){
     System.out.println("You have a pair!");
   } else if(Cardidentity.equals(Cardidentity5)){
     System.out.println("You have a pair!");
   } else if(Cardidentity2.equals(Cardidentity3)){
     System.out.println("You have a pair!");
   } else if(Cardidentity2.equals(Cardidentity4)){
     System.out.println("You have a pair!");
   } else if(Cardidentity2.equals(Cardidentity5)){
     System.out.println("You have a pair!");
   }else if(Cardidentity3.equals(Cardidentity4)){
     System.out.println("You have a pair!");
   }else if(Cardidentity3.equals(Cardidentity5)){
     System.out.println("You have a pair!");
   }else if(Cardidentity4.equals(Cardidentity5)){
     System.out.println("You have a pair!");
   }else {System.out.print("You have a high card hand!");
       
   }
  
  
  
   //   String FirstCard= Cardidentity +" of " + Suit;
    //String SecondCard= Cardidentity2 +" of "+ Suit2;
    //String ThirdCard= Cardidentity3 +" of "+Suit3;
    //String FourthCard= Cardidentity4 +" of "+ Suit4;
    //String FifthCard= Cardidentity5 +" of "+ Suit5;
    
    
    
   
   
   
   
   
   
   // System.out.println(FirstCard + " " + SecondCard +" "+ ThirdCard +" "+ FourthCard +" "+ FifthCard);
    
    
    
    

        
        
        
        
        
        
    }
    
  
    }