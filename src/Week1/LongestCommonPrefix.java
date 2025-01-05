package Week1;

import java.util.Arrays;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {

    StringBuilder answer = new StringBuilder();

    int shortestString = Arrays
        .stream(strs)
        .mapToInt(String::length)
        .min()
        .orElse(0);

    boolean isNotCommon = false;

    for (int i = 0; i < shortestString; i++) {
      char current = strs[0].charAt(i);

      for (String str : strs) {
        if (str.charAt(i) != current) {
          isNotCommon = true;
          break;
        }
      }

      if (isNotCommon) {
        break;
      }

      answer.append(current);
    }

    return answer.toString();
  }
}
