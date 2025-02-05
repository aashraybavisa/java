package Assessments.CISCO;

// Question
// The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. Once submitted, you cannot review this problem again. You can use System.out printin() to debug your code. The System.out.printin) may not work in case of syntax/runtime error. The version of JDK being used is 1.8.
// Note: The main class name must be "Solution".
// Given an integer X, write an algorithm to find the number of integers which are less than or equal to X and whose digits add up to Y.
// Input
// The first line of input consists of an integer- inputNumi, representing the given number X.
// The next line consists of an integer- inputNum2, representing the given number Y.
// Output
// Print the count of numbers whose digits add up to Y for the given number X.
// Note
// -1.
// if no numbers are found whose digits add up to Y for the given number X, then print
// Example
// Input:
// 20
// 5
// Output:
// 2
// Explanation:
// X is 20 and Y is 5. There are only 2 integers <= 20, i.e., 5 and 14 whose digits add up to 5
// So, the output is 2.

// CODE:
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /*
//  * inputNum1, represents the number X.
// inputNum2, represents the number Y.
//  */
// public class Solution
// {
// 	public static void  funcCount(int inputNum1, int inputNum2)
// 	{
// 		// Write your code here

// 	}

// 	public static void main(String[] args)
// 	{
// 		Scanner in = new Scanner(System.in);
// 		// input for inputNum1
// 		int inputNum1 = in.nextInt();

// 		// input for inputNum2
// 		int inputNum2 = in.nextInt();

// 		funcCount(inputNum1, inputNum2);
// 	}
// }
import java.util.*;

/*
 * inputNum1, represents the number X.
 * inputNum2, represents the number Y.
 */
public class Q3_FY23 {

  public static void funcCount(int inputNum1, int inputNum2) {
    int count = 0;

    // Iterate through all numbers from 1 to inputNum1
    for (int i = 1; i <= inputNum1; i++) {
      int sum = 0;
      int num = i;

      // Calculate the sum of the digits of the current number
      while (num > 0) {
        sum += num % 10;
        num /= 10;
      }

      // If the sum of digits equals inputNum2, increment the count
      if (sum == inputNum2) {
        count++;
      }
    }

    // Print the count
    System.out.println(count);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // input for inputNum1
    int inputNum1 = in.nextInt();

    // input for inputNum2
    int inputNum2 = in.nextInt();

    // Call the function to count the numbers
    funcCount(inputNum1, inputNum2);
  }
}
