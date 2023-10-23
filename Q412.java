import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to generate a list of strings based on the input integer n.
 * If the integer is divisible by 3, the string "Fizz" is added to the list.
 * If the integer is divisible by 5, the string "Buzz" is added to the list.
 * If the integer is divisible by both 3 and 5, the string "FizzBuzz" is added to the list.
 * Otherwise, the integer itself is added to the list as a string.
 */
public class Q412 {
  public List<String> fizzBuzz(int n) {
     List<String> result = new ArrayList<>();
      for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          result.add("FizzBuzz");
        } else if (i % 3 == 0) {
          result.add("Fizz");
        } else if (i % 5 == 0) {
          result.add("Buzz");
        } else {
          result.add(String.valueOf(i));
        }
      }
    return result;
    }
}