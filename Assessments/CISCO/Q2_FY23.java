package Assessments.CISCO;

// Question
// Note: The main class name must be "Solution"
// Ray, Shiv and Ansh are conducting a survey for a group of people. The survey is only meant for twins but there are certain people who are not twins and wanting to take part in the survey.
// Write an algorithm to help them identify the person from the given input who is not a twin.
// Input
// The first line of input consists of an integer- inputArr_size, representing the number of entries in the array (N).
// The next line consists of N space-separated integer elements in the array.
// Output
// Print the smallest value of the person who is not a twin from the given array of elements.
// Note
// If everyone present is a twin, then return -1.
// Examples
// Example 1:
// Input:
// 7
// 1123344
// Output:
// 2
// explanation:
// In the given array of element, only non-twin element is '2'.
// So, the output is 2.
// Example 2:
// Input:
// 4
// 1122
// Output:
// -1
// Explanation:
// Given array of element contain all the twin elements.
// So, the output is -1.

// CODE:
// initial code -
// import java.util.*;
// import java.lang.*;
// import java.io.*;

/*
 * inputArr, represents the given array of element of size inputArr_size.
 */
// public class Solution
// {
// 	public static void  funcTwins(int[] inputArr)
// 	{
// 		// Write your code here

// 	}

// 	public static void main(String[] args)
// 	{
// 		Scanner in = new Scanner(System.in);
// 		//input for inputArr
// 		int inputArr_size = in.nextInt();
// 		int inputArr[] = new int[inputArr_size];
// 		for(int idx = 0; idx < inputArr_size; idx++)
// 		{
// 			inputArr[idx] = in.nextInt();
// 		}

// 		funcTwins(inputArr);
// 	}
// }

import java.util.*;

public class Q2_FY23 {

  public static void funcTwins(int[] inputArr) {
    // Create a map to store the frequency of each element
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    // Count the frequency of each element in the array
    for (int num : inputArr) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    // Find the smallest element that appears only once
    int smallestNonTwin = Integer.MAX_VALUE;
    for (int num : inputArr) {
      if (frequencyMap.get(num) == 1 && num < smallestNonTwin) {
        smallestNonTwin = num;
      }
    }

    // If no non-twin element is found, return -1
    if (smallestNonTwin == Integer.MAX_VALUE) {
      System.out.println(-1);
    } else {
      System.out.println(smallestNonTwin);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //input for inputArr
    int inputArr_size = in.nextInt();
    int inputArr[] = new int[inputArr_size];
    for (int idx = 0; idx < inputArr_size; idx++) {
      inputArr[idx] = in.nextInt();
    }

    funcTwins(inputArr);
  }
}
