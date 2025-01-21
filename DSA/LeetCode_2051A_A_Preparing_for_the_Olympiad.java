package DSA;

//  @link: https://codeforces.com/contest/2051/problem/A
//  @problemCode: 2051A
//  @author: Aashray Bavisa
//  @since: Jan 19, 2025
//  @status: Solved

import java.io.*;
import java.util.*;

public class LeetCode_2051A_A_Preparing_for_the_Olympiad implements Runnable {

  BufferedReader in;
  PrintWriter out;
  StringTokenizer tok = new StringTokenizer("");

  public static void main(String[] args) {
    new Thread(null, new LeetCode_2051A_A_Preparing_for_the_Olympiad(), "", 256 * (1L << 20))
      .start();
  }

  public void run() {
    try {
      long t1 = System.currentTimeMillis();
      //   if (System.getProperty("ONLINE_JUDGE") != null) {
      in = new BufferedReader(new InputStreamReader(System.in));
      out = new PrintWriter(System.out);
      //   } else {
      //     in = new BufferedReader(new FileReader("input.txt"));
      //     out = new PrintWriter("output.txt");
      //   }
      Locale.setDefault(Locale.US);
      solve();
      in.close();
      out.close();
      long t2 = System.currentTimeMillis();
      //   System.err.println("Time = " + (t2 - t1));
    } catch (Throwable t) {
      t.printStackTrace(System.err);
      System.exit(-1);
    }
  }

  String readString() throws IOException {
    while (!tok.hasMoreTokens()) {
      tok = new StringTokenizer(in.readLine());
    }
    return tok.nextToken();
  }

  int readInt() throws IOException {
    return Integer.parseInt(readString());
  }

  long readLong() throws IOException {
    return Long.parseLong(readString());
  }

  double readDouble() throws IOException {
    return Double.parseDouble(readString());
  }

  // solution

  void solve() throws IOException {
    int t = readInt();
    for (int i = 0; i < t; i++) {
      int n = readInt();
      int[] a = new int[n];
      int[] b = new int[n];
      for (int x = 0; x < n; x++) {
        a[x] = readInt();
      }
      for (int x = 0; x < n; x++) {
        b[x] = readInt();
      }

      int ans = 0;
      for (int x = 0; x < n - 1; x++) {
        if (a[x] > b[x + 1]) {
          ans += a[x] - b[x + 1];
        }
      }
      ans += a[n - 1];
      System.out.println(ans);
    }
  }
}
