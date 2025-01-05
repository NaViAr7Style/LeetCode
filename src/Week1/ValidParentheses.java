package Week1;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

  public boolean isValid(String s) {

    Deque<Character> stack = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      char current = s.charAt(i);

      switch (current) {
        case '(', '{', '[': stack.push(current); break;
        case ')':
          if (stack.isEmpty()) return false;

          if (stack.peek() == '(') {
            stack.pop();
          } else {
            stack.push(current);
          }
          break;
        case '}':
          if (stack.isEmpty()) return false;

          if (stack.peek() == '{') {
            stack.pop();
          } else {
            stack.push(current);
          }
          break;
        case ']':
          if (stack.isEmpty()) return false;

          if (stack.peek() == '[') {
            stack.pop();
          } else {
            stack.push(current);
          }
          break;
      }
    }

    return stack.isEmpty();
  }

}
