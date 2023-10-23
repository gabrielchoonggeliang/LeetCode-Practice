/**
 * This class provides a method to check if a ransom note can be constructed from a magazine.
 */
public class Q383 {
  /**
   * Checks if the characters in the ransomNote can be constructed from the characters in the magazine.
   * @param ransomNote the ransom note string
   * @param magazine the magazine string
   * @return true if the ransom note can be constructed from the magazine, false otherwise
   */
  public boolean canConstruct(String ransomNote, String magazine) {
    int[] charCount = new int[26]; // Assuming lowercase English letters
    // Note: the new intialiser intiatiates default values for charCount i.e. zero

    // Count the occurrences of characters in the magazine
    for (char c : magazine.toCharArray()) {
      charCount[c - 'a']--; // if b occurs 2 times then charCount[1] == -2
    }

    // Check if the characters in the ransomNote can be constructed from magazine
    for (char c : ransomNote.toCharArray()) {
      int index = c - 'a'; // checks for ransomNote now
      charCount[index]++;
      if (charCount[index] > 0) {
        return false;
      }
    }

    return true;
  }
}
