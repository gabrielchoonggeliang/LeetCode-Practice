/**
 * The Q1480 class contains a method for calculating the running sum of an integer array.
 */
public class Q1480 {
  
  /**
   * Calculates the running sum of an integer array.
   * 
   * @param nums The input integer array.
   * @return An integer array containing the running sum of the input array.
   */
  public int[] runningSum(int[] nums) {
    int length = nums.length;
    int sum = 0;
    int[] total = new int[length];

    for (int i = 0; i < length; i++) {
      sum += nums[i];
      total[i] = sum;
    }

    return total;
  }
}