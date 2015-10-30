
import java.util.Scanner;

public class exam2{

public static void main(String [] args){


/*
    int j= 0;
    int i =0;
    
    for(j=9; j>0; j--){
        for(i=1; i<=j; i++){
            
            if(i==j){
                System.out.print(j);
            }
            
            else{
                System.out.print(" ");
            }
            
            
            
        }
    
        System.out.println(" ");
    }
    
    */
    
    
   /* 
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Enter an int: ");
    int myint = myScanner.nextInt();
    
   
    
    int secondint =0;
    int mysecint = 0;
  //  boolean greaterint =false;
  
   
   do {
         
        System.out.println("Enter an int greater than " + myint + ":");
          mysecint = myScanner.nextInt();
        
         if(mysecint > myint){
             secondint = mysecint;
           // greaterint = true; 
         }
         
         else{
             System.out.println("Sorry you entered " + mysecint + "<=" + myint);
             System.out.println("Enter an int greater than " + myint + ": ");
             myScanner.next();
         }
     } while(mysecint <= myint);
    
    System.out.println(myint + "..." + secondint + "=" + sum(myint, secondint));
    
    
}



public static int sum(int myint, int secondint){
   // int i =0;
    int total =0;
    for(int i = myint; i<=secondint; i++){
        total += i;
    }
    return total;
}
    
    
*/



Scanner myinput = new Scanner(System.in);



int myint =0;
int Sum =0;

do{ System.out.println("Enter and int: ");
    myint = myinput.nextInt();
    
    
    if(myint>0){
    Sum = sumsq(myint);
}

else{
    System.out.println("Enter a positive int:");
    myinput.next();
}

} while(myint<=0);

System.out.println("The sum of 1+2*2+3*3+...+n*n for n=" + myint +" is " + Sum);





}

public static int sumsq(int myint){
    int n = myint;
    int i=0;
    int total = 0;
    
    for(i=1; i<=n; i++){
        total+=i*i;
  
    }

    return total;
}




}