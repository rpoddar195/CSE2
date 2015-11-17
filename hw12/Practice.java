import java.util.Scanner;
public class Practice{
    //a method called randomMatrix() 
    public static int[][] randomMatric(int width, int height){
        int[][] matrix = new int[width][height];
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                matrix[i][j]= (int)(Math.random()*20-10);
            }
        }
        return matrix;
    }//end of a method called randomMatrix() 
    
    //a second method called printMatrix
    public static void printMatrix(int[][] matrix,int width, int height){
        if (width == height){
            System.out.println("Warning! The matrix is not rectangular.");
        }
        for (int row = 0; row < width; row++){
            for(int column = 0; column < height; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }//end of print
    
    //a method called transposeMatrix()
    public static void transposeMatrix(int[][] matrix){
        int address = -1;
        for (int first = 0; first < matrix.length; first++ ){
            for(int second = 0; second < matrix[first].length; second++){
                address++;
                System.out.println("Address: " + address + "Coordinates: " + "[" + first + "," + second + "]  " + "Value: " + matrix[first][second]);
            }
        }
    }//end of a method called transposeMatrix()
    public static void main(String[] args){
        System.out.print("Enter the width:");
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        while(!input.hasNextInt()){
            System.out.print("Enter an integer for width:");
            width = input.nextInt();
            while (width <= 0){
                System.out.print("Enter a postive integer for width");
                width = input.nextInt();
            }
        }
        System.out.print("Enter the height:");
        int height = input.nextInt();
        while(!input.hasNextInt()){
            System.out.print("Enter an integer for height:");
            height = input.nextInt();
            while(height <= 0){
                System.out.print("Enter a postive integer for height:");
                height = input.nextInt();
            }
        }
        System.out.println("The matrix is: " + height + " * " + width);
        randomMatric(width,height);
        printMatrix(matrix,width,height);
        transposeMatrix(matrix);
    }//end of main method
}//end of matrix