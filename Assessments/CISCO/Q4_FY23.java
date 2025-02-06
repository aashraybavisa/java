package Assessments.CISCO;

// Lucy loves to play the Hop, Skip and Jump game. Given an N*M matrix and starting from cell (1.1), her challenge is to hop in an anti-clockwise direction and skip alternate cells. The goal is to find out the last cell she would hop onto.

// Write an algorithm to find the last cell Lucy would hop onto after moving anti-clockwise and skipping alternate cells.

// Input

// The first line of input consists of two integers- matrix_row and matrix_col, representing the number of rows (N) and the number of columns (M) in the matrix, respectively. The next M lines consist of N space-separated integers representing the elements in each cell of the matrix.

// Output

// Print an integer representing the last cell Lucy would hop onto after following the given instructions.

// Example

// Input:

// 33

// 29.8 37

// 15 41 3

// 1 10 14

// Output:

// 41

// Explanation:

// Lucy starts with 29, skips 15, hops onto 1, skip 10, hops onto 14, skips 3, hops onto 37, skips 8 and finally hops onto 41.

// So, the output is 41.

// matrix, represents the elements in each cell of the matrix of size NM.

// */

// public class Solution

// public static void funcHopSkipJump(int[] [] matrix)

// {

// // Write your code here

// }
// public static void main(String[] args)

// {

// Scanner in = new Scanner(System.in);

// // input for matrix

// int matrix_row = in.nextInt();

// int matrix_col = in.nextInt();

// int matrix[] [] = new int[matrix_row] [matrix_col];

// for(int idx = 0; idx < matrix_row; idx++)

// {

// for(int jdx = 0; jax < matrix_col; jdx++)

// {

// matrix [idx] [jdx] = in.nextInt();

// }

// funcHopSkipJump(matrix);

// }
import java.util.*;

public class Q4_FY23 {

  public static void funcHopSkipJump(int[][] matrix) {
    int matrix_row = matrix.length;
    int matrix_col = matrix[0].length;

    int top = 0, bottom = matrix_row - 1;
    int left = 0, right = matrix_col - 1;
    int lastCell = 0;
    boolean hop = true; // Flag to indicate whether to hop or skip

    while (top <= bottom && left <= right) {
      // Move right along the top row
      for (int i = left; i <= right; i++) {
        if (hop) {
          lastCell = matrix[top][i];
        }
        hop = !hop; // Toggle hop/skip
      }
      top++;

      // Move down along the right column
      for (int i = top; i <= bottom; i++) {
        if (hop) {
          lastCell = matrix[i][right];
        }
        hop = !hop; // Toggle hop/skip
      }
      right--;

      if (top <= bottom) {
        // Move left along the bottom row
        for (int i = right; i >= left; i--) {
          if (hop) {
            lastCell = matrix[bottom][i];
          }
          hop = !hop; // Toggle hop/skip
        }
        bottom--;
      }

      if (left <= right) {
        // Move up along the left column
        for (int i = bottom; i >= top; i--) {
          if (hop) {
            lastCell = matrix[i][left];
          }
          hop = !hop; // Toggle hop/skip
        }
        left++;
      }
    }

    // Output the last cell
    System.out.println(lastCell);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Input for matrix
    int matrix_row = in.nextInt();
    int matrix_col = in.nextInt();
    int[][] matrix = new int[matrix_row][matrix_col];

    for (int idx = 0; idx < matrix_row; idx++) {
      for (int jdx = 0; jdx < matrix_col; jdx++) {
        matrix[idx][jdx] = in.nextInt();
      }
    }

    // Call the function
    funcHopSkipJump(matrix);
  }
}
