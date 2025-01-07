package DSA;

import java.util.Stack;

public class LeetCode_MinStack {

  public Stack<Integer> stk;
  public Stack<Integer> min;

  public LeetCode_MinStack() {
    stk = new Stack<Integer>();
    min = new Stack<Integer>();
  }

  public void push(int val) {
    if (this.min.empty() || val <= this.min.peek()) {
      this.min.push(val);
    }
    stk.push(val);
  }

  public void pop() {
    if (stk.peek().equals(min.peek())) {
      this.min.pop();
    }
    stk.pop();
  }

  public int top() {
    return stk.peek();
  }

  public int getMin() {
    return this.min.peek();
  }
}
