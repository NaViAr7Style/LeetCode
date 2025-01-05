import Week1.ValidParentheses;

public class Main {
  public static void main(String[] args) {

    ValidParentheses vp = new ValidParentheses();

    System.out.println(vp.isValid("()"));
    System.out.println(vp.isValid("()[]{}"));
    System.out.println(vp.isValid("(]"));
    System.out.println(vp.isValid("([])"));

  }
}