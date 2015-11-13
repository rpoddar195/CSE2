/* Ritika Poddar
CSE2
lab12
*/


public class ArrayManipulation{
    
    
    public static void main(String[] args){
        int[][] ThisArray = raggedArray();
        
        printArray(ThisArray);
        findSmallest(ThisArray);
        findLargest(ThisArray);
        mostEven(ThisArray);
        
    }// end of main method
        
       
       
       
        public static int[][] raggedArray(){
        int MyArray[][];
        
        int x = (int) (Math.random()*20) + 10;
        MyArray = new int[x][];
        
       for(int a=0; a<x; a++){
        int y = (int) (Math.random()*20) + 10;
      
        MyArray[a] = new int[y];
        
        
        for(int j=0;j< y; j++){
            int random = (int) (Math.random()*2000) - 1000;
            MyArray[a][j] = random;
        }
        
       }
            return MyArray;
         
          }  //end of raggedArray
          
        
        
        
        
          public static void printArray( int [] [] MyArray){
           for( int a=0; a< MyArray.length; a++){
           System.out.print(a + ":  ");
           for( int b=0; b< MyArray[a].length; b++){
              System.out.print(MyArray[a][b] + " "); 
           }
       System.out.println(" ");
           
       }
          }// end of printArray
          
        
        
        
        
          public static void printArray (int [] MyArray){
                for (int i = 0; i < MyArray.length; i++) {
                System.out.print(MyArray[i] + " ");  
            }    
        
       }
          
          
      
      
      
        public static void findSmallest(int [] [] MyArray){
            int smallest =0;
            int min = 20;
            int index=0;
        
            for(int i=0; i< MyArray.length; i++){
                    if(MyArray[i].length < min){
                        min = MyArray[i].length;
                        index = i;
                        
                    }
                    
                }
            
        
           System.out.println("Smallest array is " + index); 

            
        }// end of findSmallest
        
       
       
       
       
       
        public static void findLargest( int [] [] MyArray){
            int one =0;
            int two =0;
            int max = MyArray[0][0];
            
            
            
           for( int a=0; a< MyArray.length ; a++){
           for( int b=0; b< MyArray[a].length; b++){
              if (MyArray[a][b] > max){
                  one = a;
                  two = b;
                  max = MyArray[one][two];
              }
           }
            
        }
        System.out.println("Largest member is " + max);
            
        
        
        }// end of findLargest
        
        
        public static void mostEven( int [] [] MyArray){
           
            int number = 0;
           
            int mostcounter =0;
            
            
           for( int a=0; a< MyArray.length ; a++){
           int counter=0; 
          
           for( int b=0; b< MyArray[a].length; b++){
              if (MyArray[a][b] % 2 == 0){
                  counter++;
                  
              }
            
           }
          if(counter > mostcounter){
             mostcounter = counter;
              number = a;
          }
          
            
        }
        System.out.println("The most even array is " + number);
            
            
        }
        
        
    
    
    
    
  
    
    
    
    
    
    
}// end of class