import java.util.Scanner;
//Jaime Elizalde :p
public class BinaryChanger {
	public static void main(String[] arg) {
		System.out.println("Enter a 4-bit binary number:");
		Scanner k = new Scanner(System.in);//This code allows the user to input the numbers
		String[] binaryString1 = new String[4]; //Is in fact a string, in order to separate the values
		String num1 = k.nextLine();
		
		/*The following code puts every character of the string
		 * into the array through the use of substrings
		 * */
		for(int i =0; i < binaryString1.length; i++) {
			binaryString1[i] = num1.substring(i, i+1);
		}
		/*The following code converts the array of binary strings
		 * into an array of  integers, allowing the code to 
		 * use them in math*/
		int[] binaryNums1 = new int[4];
		for(int i = 0;i < binaryNums1.length; i++) {
			binaryNums1[i] = Integer.parseInt(binaryString1[i]);
		}
		/*The following code uses the integer array to convert the
		 * set of 0s and 1s into the sum, by using the base and multiplying
		 * it to the integer i, then adding it to the sum.*/
		int sum1 = 0;
		for(int i = 0; i < binaryNums1.length; i++){
			if(i == 0){
				sum1 += (binaryNums1[i] * 8);
			}
			if(i == 1){
				sum1 += (binaryNums1[i] * 4);
			}
			if(i == 2){
				sum1 += (binaryNums1[i] * 2);
			}
			if(i == 3) {
				sum1 += (binaryNums1[i] * 1);
			}
		}
		/*These lines of code follow the exact procedures that were also
		 * used to find the sums of the first one.*/
		System.out.println("Enter another 4-bit binary number: ");
		String[] binaryString2 = new String[4];
		String num2 = k.nextLine();
		for(int i =0; i < binaryString2.length; i++) {
			binaryString2[i] = num2.substring(i, i+1);
		}
		
		int[] binaryNums2 = new int[4];
		for(int i = 0;i < binaryNums2.length; i++) {
			binaryNums2[i] = Integer.parseInt(binaryString2[i]);
		}
		int sum2 = 0;
		for(int i = 0; i < binaryNums2.length; i++){
			if(i == 0){
				sum2 += (binaryNums2[i] * 8);
			}
			if(i == 1){
				sum2 += (binaryNums2[i] * 4);
			}
			if(i == 2){
				sum2 += (binaryNums2[i] * 2);
			}
			if(i == 3) {
				sum2 += (binaryNums2[i] * 1);
			}
		}
		/*The following code adds up the sums to print out the 
		 * sums and their combined value*/
		int sumOfSums = sum1 + sum2;
		System.out.println("The first number is: " + sum1);
		System.out.println("The second number is: " + sum2);
		System.out.println("Added together it is: " + sumOfSums);
	}

}
