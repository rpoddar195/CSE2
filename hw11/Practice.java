/*Ritika Poddar
CSE2
HW#11
*/



import java.util.Scanner;
import java.util.Arrays;//for sorting later 

public class CSE2Linear{
    public static void main(String[] args){
        int studentGrade[];//decalre an array
        studentGrade = new int[15];//allocate the size
        System.out.print("Please enter an integral ranging from 0 to 100: ");
        for (int i = 1; i < 16; i++){
            Scanner input = new Scanner(System.in);
            int grade[];
            grade = new int[16];
            grade[i] = input.nextInt();
            grade[0] = -1;
            // checking input
            if(!input.hasNextInt()){// if the user enters anything other than an int.
                System.out.print("Not an integer.");
                break;
            }//end of if
            else if(grade[i] < 0 || grade[i] > 100){//error message for an int that is out of the range from 0-100
                System.out.print("Out of range!");
                break;
            }//end of else if
            else if(grade[i] < grade[i-1] ){// not greater than or equal to the last int.
                System.out.print("The number should be larger than the last one.");
            }
            else{
               studentGrade[i] = grade[i-1];
            }//end of else
            System.out.print(studentGrade[i] + " ");
        }//end of for 
        
        printArray(studentGrade);//Print the final input array.
        //print the sorted 
        Arrays.sort(studentGrade);
        printArray(studentGrade);//print the sorted array
        
        System.out.print("Enter a grade to search:");
        Scanner input = new Scanner(System.in);
        int userSearch1 = input.nextInt();//enter a grade to be searched for
        for (int d = 0; d < 15; d++){
               int first  = studentGrade[0];
               int last   = studentGrade[15];
               int middle = (first + last)/2;
               if ( studentGrade[middle] < userSearch1 ){
                          first = middle + 1;    
                }
                else if ( studentGrade[middle] == userSearch1 ){
                    System.out.println(userSearch1 + " found at location with" + d + "iteration.");
                       break;
                }
                else{
                    last = middle - 1;
                    middle = (first + last)/2;
                }
        }
        
        
        
        shuffle(studentGrade);//scramble the sorted array randomly
        System.out.println("Shuffled: ");
        printArray(studentGradeNew);//print out the scrambled array
         //ask the user for input
        System.out.print("Enter a grade to search:");
        //Scanner input = new Scanner(System.in);
        int userSearch2 = input.nextInt();
        for ( int w = 0; w < 15; w++){
            if (studentGrade[w] == userSearch2){     /* Searching element is present */
                System.out.println(userSearch2 + " is found with " + w + "iteration.");
                break;
            }
            
                System.out.println(userSearch2 + "is not found, with 15 iteration.");
            
  
        } 
        
       
        
    }//end of main method
        
        public static void shuffle( int[] studentGrade){
            for(int m = 0; m<15; m++){   
                int studentGradeNew = studentGrade[0];
                int x = (int) (Math.random()*15); // shuffle the cards with a random number each time
                studentGrade [0] = studentGrade [x];
                studentGrade [x] = studentGradeNew;
            }
        }
        
        public static void printArray( int [] cards){
            for (int i = 0; i < 15; i++) {
                System.out.print(cards[i] + " ");  
            }    
        }
        
}//end of class