public class Q1295 {
  public int findNumbers(int[] nums) {
    // even number of digits, not even digits
    int total = 0;
    
    for (int i = 0; i < nums.length; i++) {
      int step = 0;

      while (nums[i] >= 1) {
        nums[i] = nums[i] / 10; // grab the last digit => don't use the modulus operator
        step++;
      }

      if (step % 2 == 0) {
        total++;
      }

    }

    return total;
  }
}