/**
 * This class contains a method to check if a given integer is a power of four.
 */
public class Q342 {
  
  /**
   * Returns true if the given integer is a power of four, false otherwise.
   * 
   * @param n the integer to check
   * @return true if the given integer is a power of four, false otherwise
   */
  public boolean isPowerOfFour(int n) {
    return n > 0 && (n & (n-1)) == 0 && (n-1) % 3 == 0;
  }
}