package DSA;
// package DSA;

//  @link: https://codeforces.com/contest/2051/problem/C
//  @problemCode: 2051C
//  @author: Aashray Bavisa
//  @since: Jan 19, 2025
//  @status: Solved

import static java.lang.Math.*;

import java.awt.Point;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class CF_2051C_Preparing_for_the_Exam implements Runnable {

  BufferedReader in;
  PrintWriter out;
  StringTokenizer tok = new StringTokenizer("");

  public static void main(String[] args) {
    new Thread(null, new CF_2051C_Preparing_for_the_Exam(), "", 256 * (1L << 20))
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
      int a = readInt();
      int b = readInt();
      int[] A = new int[a];
      int[] B = new int[b];
      for (int x = 0; x < a; x++) {
        A[x] = readInt();
      }
      for (int x = 0; x < b; x++) {
        B[x] = readInt();
      }
      //
      if (n > a) {
        System.out.println("0".repeat(a));
        continue;
      }
      if (n == a && a == b) {
        System.out.println("1".repeat(a));
        continue;
      }
      String ans = "";
      boolean gotIt = false;
      for (int x = 0; x < a; x++) {
        if (x < b && A[x] != B[x] && !gotIt) {
          ans += "1";
          gotIt = true;
        } else {
          ans += "0";
        }
      }
      System.out.println(ans);
    }
  }
}
