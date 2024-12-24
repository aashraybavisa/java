package DSA;
//  @link: https://codeforces.com/contest/2043/problem/A
//  @problemCode: 2043A
//  @author: Aashray Bavisa
//  @since: Dec 24, 2024
//  @status: Solved

import static java.lang.Math.*;

import java.awt.Point;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class A_Coin_Transformation implements Runnable {

  BufferedReader in;
  PrintWriter out;
  StringTokenizer tok = new StringTokenizer("");

  public static void main(String[] args) {
    new Thread(null, new A_Coin_Transformation(), "", 256 * (1L << 20)).start();
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
      long x = readLong();
      long ans = 1;
      while (x > 3) {
        x = Math.floorDiv(x, 4);
        ans *= 2;
      }
      System.out.println(ans);
    }
  }
}
