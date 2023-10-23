/**
 * The Q1342 class contains a method to calculate the number of steps required to reduce a given non-negative integer to zero.
 */
public class Q1342 {

  /**
   * Calculates the number of steps required to reduce a given non-negative integer to zero.
   * 
   * @param num the non-negative integer to be reduced to zero
   * @return the number of steps required to reduce the given integer to zero
   */
  public int numberOfSteps(int num) {
    int steps = 0;

    if (num == 0) {
      return num;
    }
    
    for (int i = num; i >= 0; i--) {

      if (num % 2 == 0) {
        num /= 2;
      } else if (num % 2 == 1){
        num--;
      }

      steps++; // zero check required
      i = num;
    }
    
    return steps;
  }
}