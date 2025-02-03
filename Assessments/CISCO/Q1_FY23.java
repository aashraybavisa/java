package Assessments.CISCO;

import java.util.*;
import java.util.regex.*;

public class Q1_FY23 {

  public static String[] funcValidPairs(String[] inputStr) {
    String[] answer = new String[inputStr.length];
    for (int i = 0; i < inputStr.length; i++) {
      String pair = inputStr[i];
      if (isValidPair(pair)) {
        answer[i] = "Valid";
      } else {
        answer[i] = "Invalid";
      }
    }
    return answer;
  }

  private static boolean isValidPair(String pair) {
    // Regular expression to match the pattern
    String regex =
      "^\\(([-+]?)(90(\\.0+)?|[1-8]?\\d(\\.\\d+)?),([-+]?)(180(\\.0+)?|1[0-7]\\d(\\.\\d+)?|[1-9]?\\d(\\.\\d+)?)\\)$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(pair);
    if (!matcher.matches()) {
      return false;
    }

    // Extract latitude and longitude
    String[] parts = pair.substring(1, pair.length() - 1).split(",");
    double latitude = Double.parseDouble(parts[0]);
    double longitude = Double.parseDouble(parts[1]);

    // Check the range
    return (
      (latitude >= -90 && latitude <= 90) &&
      (longitude >= -180 && longitude <= 180)
    );
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // Input for inputStr
    int inputStr_size = in.nextInt();
    String[] inputStr = new String[inputStr_size];
    for (int idx = 0; idx < inputStr_size; idx++) {
      inputStr[idx] = in.next();
    }

    String[] result = funcValidPairs(inputStr);
    for (int idx = 0; idx < result.length - 1; idx++) {
      System.out.print(result[idx] + " ");
    }
    System.out.print(result[result.length - 1]);
  }
}
//
// ===========> Question
// You are given a list of strings that may represent valid latitude/longitude pairs. Your task is to check if the given latitude/longitude pairs are valid or not.
// A string (X,Y) is considered valid if the following criteria are met:
// • The string starts with a bracket, has a comma after X and ends with a bracket.
// - There is no space between the opening parenthesis and the first character of X.
// • There is no space between the comma and the last character of X.
// • There is no space between the comma and the first character of Y.
// - There is no space between Y and the closing parenthesis.
// • X and Y are decimal numbers and may be preceded by a sign.
// • There are no leading zeros.
// • No other characters are allowed in X or Y.
// • -90 ≤ X ≤ 90 and -180 ≤ Y ≤ 180
// Write an algorithm to identify the valid and invalid latitude/longitude pairs from the given list of strings.
// Input
// The first line of input consists of an integer- input size, representing the size of the string (N):
// The next line consists of N space-separated substrings containing the latitude/longitude pairs.
// Output
// Print N space separated strings representing the valid and invalid latitude/longitude pairs from the given list of strings. Print "Valid" for valid pairs and "Invalid" for invalid pairs.
// Constraints
// 1≤ N≤ 100
// Example
// Input:
// 5
// (90,180) (+90 +180) (90.,180) (90.0,180.1) (855,95.)
// Output:
// Valid Valid Invalid Invalid Invalid
// Explanation:
// In the given string, substrings f(90,180), (+90, +180)} are valid as they meet the given criteria but substrings
// ((90., 180), (90.0,180.1), (855,95W)) are invalid as substring {'(90., 180)} has an extra decimal point after
// "90", substring (90.0,180.1)} contains '180.1' which is out of bound and substring (855,95W) contains characters in it.
// ===========> CODE GIVEN:
// import java.util.*;
// import java.lang.*;
// import java.io.*;
// /*
//  * inputStr, represents the given string containing substring of latitude/longitude pairs.
//  */
// public class Solution
// {
// 	public static String[]  funcValidPairs(String[] inputStr)
// 	{
// 		String[]  answer = new String[100];
// 		// Write your code here
// 		return answer;
// 	}
// 	public static void main(String[] args)
// 	{
// 		Scanner in = new Scanner(System.in);
// 		//input for inputStr
// 		int inputStr_size = in.nextInt();
// 		String inputStr[] = new String[inputStr_size];
// 		for(int idx = 0; idx < inputStr_size; idx++)
// 		{
// 			inputStr[idx] = in.next();
// 		}
// 		String[] result = funcValidPairs(inputStr);
// 		for(int idx = 0; idx < result.length - 1; idx++)
// 		{
// 			System.out.print(result[idx] + " ");
// 		}
// 		System.out.print(result[result.length - 1]);
// 	}
// }
