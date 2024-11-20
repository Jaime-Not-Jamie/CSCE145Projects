package matrixAddition;
import java.util.Scanner;
//Jaime Elizalde :p
public class matrixAddition {

	public static void main(String[] args) {
		System.out.println("Welcome to matrix adder program!");
		System.out.println("Please enter the length and with of the first matrix: ");
		Scanner k = new Scanner(System.in);
		/*These two 'input' values serve as the length and width of the matrix
		 * Which are then used to be the values that create the dimensions of the
		 * matrix/array*/
		int input1 = k.nextInt();
		int input2 = k.nextInt();
		int[][] matrix1 = new int[input1][input2];
		/*The following for loop works as following, so first it measures the 
		 * length of the array, or how many rows it has, then it goes into another
		 * for loop which measures how many values are in each row. Then it asks
		 * the user for the values for each of the the spots in the matrix*/
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix1[i].length; j++){
				System.out.println("Enter value at Index: " + i + " " + j);
				matrix1[i][j] = k.nextInt();
			}
		}
		/*The following code is nearly identical to the creation of the
		 * matrix however, before proceeding to create the array, the code uses 
		 * an if statement to make sure that the arrays are of the same length 
		 * and width, otherwise it ends the program*/
		System.out.println("Please enter the length and with of the second matrix: ");
		int input3 = k.nextInt();
		int input4 = k.nextInt();
		if(input1 != input3 || input2 != input4){
			System.out.println("Invalid Dimensions. These cannot be added");
			System.exit(0);
		}
		int[][] matrix2 = new int[input3][input4];
		for(int i = 0; i < matrix2.length; i++){
			for(int j = 0; j < matrix2[i].length; j++){
				System.out.println("Enter value at Index: " + i + " " + j);
				matrix2[i][j] = k.nextInt();
			}
		}
		
		/*The following two for loops print both of the matrix, and indicate what 
		 * is happening*/
		for(int i = 0; i < matrix1.length; i++){
			for(int j = 0; j < matrix1[i].length; j++){
				System.out.print(matrix1[i][j]);
			}
			System.out.println();
		}
		System.out.println("+");
		for(int i = 0; i < matrix2.length; i++){
			for(int j = 0; j < matrix2[i].length; j++){
				System.out.print(matrix2[i][j]);
			}
			System.out.println();
		}
		System.out.println("=");
		
		/*The following for loop adds up the values of both matrix
		 * by creating another array which stores the sum of the values
		 * in the same places*/
		int[][] matrixSum = new int[input1][input2];
		for(int i = 0; i < matrixSum.length; i++){
			for(int j =0;j < matrixSum[i].length; j++) {
				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		/*This for loop prints out the sums that were gathered from the previous 
		 * for loop and ends the program*/
		for(int i = 0; i < matrixSum.length; i++){
			for(int j = 0; j < matrixSum[i].length; j++){
				System.out.print(matrixSum[i][j]);
			}
			System.out.println();
		}
	}

}
