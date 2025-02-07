package Assessments.bounteous;

/*
 * Company: bounteous
 * Position: Graduate Software Developer - java
 * Date: Feb 07, 2025
 */

import java.util.*;

public class GFG_RemoveDuplicate {

  /*
   * Question: Remove duplicate letter from string and return it
   */
  public static String removeDuplicate(String input) {
    HashSet<Character> uniqueSet = new HashSet<Character>();
    String ans = "";
    for (char i : input.toCharArray()) {
      if (!uniqueSet.contains(i)) {
        uniqueSet.add(i);
        ans += i;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    String ans = removeDuplicate("mvvm");
    System.out.println(ans);
  }
}
