package DSA;

class LeetCode_3042 {

  public boolean isValid(String s, String p) {
    int n1 = s.length(), n2 = p.length();
    if (n1 > n2) return false;
    return p.substring(0, n1).equals(s) && p.substring(n2 - n1).equals(s);
  }

  public int countPrefixSuffixPairs(String[] words) {
    int count = 0;
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (isValid(words[i], words[j])) count++;
      }
    }
    return count;
  }
}
