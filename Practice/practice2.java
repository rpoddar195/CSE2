public class practice2{
public static void main(String[] args){
 
 
 System.out.println("Step 3:");
        int upperbound=10;
        int basenum=10;
        int randomnumber= (int) (Math.random()*(upperbound+1)) + basenum;
        String smiley=":)";
        int counter2=randomnumber-(20-randomnumber);
        System.out.println(randomnumber);      
        while(randomnumber<20){
            System.out.print(smiley);
             randomnumber++;
            while(randomnumber==20 && counter2<randomnumber){
                System.out.print(smiley);
                counter2++;
             }          
  
      
  }
   
   
   
   }
   }