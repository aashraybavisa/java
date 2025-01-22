package DSA;

//  @link: https://codeforces.com/contest/2051/problem/B
//  @problemCode: 2051B
//  @author: Aashray Bavisa
//  @since: Jan 19, 2025
//  @status: Solved

import java.io.*;
import java.util.*;

public class CF_2051B_B_Journey implements Runnable {

  BufferedReader in;
  PrintWriter out;
  StringTokenizer tok = new StringTokenizer("");

  public static void main(String[] args) {
    new Thread(null, new CF_2051B_B_Journey(), "", 256 * (1L << 20)).start();
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
      int c = readInt();
      int fullCycle = (int) n / (a + b + c);
      int count = fullCycle * (a + b + c);
      int day = fullCycle * 3;
      while (count < n) {
        if (day % 3 == 0) {
          count += a;
        } else if (day % 3 == 1) {
          count += b;
        } else {
          count += c;
        }
        day++;
      }
      System.out.println(day);
    }
  }
}
