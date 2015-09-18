//Ritika Poddar
//lab #4
//CSE2
//This program will randomly generate a card.

//class
public class CardGenerator{
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
     
        
        System.out.println("You picked the " + Cardidentity + " of " + Suit + ".");
        
        
        
        
        
        
        
        
        
    }
}