package Week1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public int romanToInt(String s) {

    Map<Character, Integer> romanToDecimalMap = new HashMap<>();

    romanToDecimalMap.put('I', 1);
    romanToDecimalMap.put('V', 5);
    romanToDecimalMap.put('X', 10);
    romanToDecimalMap.put('L', 50);
    romanToDecimalMap.put('C', 100);
    romanToDecimalMap.put('D', 500);
    romanToDecimalMap.put('M', 1000);

    int result = 0;
    int previousValue = 0;

    for (int i = 0; i < s.length(); i++) {
      int currentValue = romanToDecimalMap.getOrDefault(s.charAt(i), 0);

      if (currentValue > previousValue) {
        result += currentValue - (2 * previousValue);
      } else {
        result += currentValue;
      }

      previousValue = currentValue;
    }

    return result;
  }
}
