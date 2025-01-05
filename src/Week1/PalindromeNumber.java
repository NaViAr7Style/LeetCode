package Week1;

public class PalindromeNumber {
  public boolean isPalindrome(int x) {

    String numString = Integer.toString(x);
    boolean isPalindrome = true;

    for (int i = 0; i < numString.length(); i++) {
      char left = numString.charAt(i);
      char right = numString.charAt(numString.length() - 1 - i);

      if (left != right) {
        isPalindrome = false;
        break;
      }
    }

    return isPalindrome;
  }
}
