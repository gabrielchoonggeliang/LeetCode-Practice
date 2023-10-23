/**
 * This class contains a method to find the middle node of a linked list.
 * The linked list is represented by a ListNode object, which contains a value
 * and a reference to the next node in the list.
 */
public class Q876 {

  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode middleNode(ListNode head) {

    int count = 0;
    ListNode current = head; // Create a separate reference for traversal

    while (current != null) {
      count++;
      current = current.next; // Move to the next node
    }

    int actualCount = 0;

    if (count % 2 == 0) {
      actualCount = count / 2;
    } else if (count % 2 == 1) {
      actualCount = count / 2;
    }

    current = head; // Reset the traversal reference

    while (actualCount > 0) {
      current = current.next; // Move to the middle node
      actualCount--;
    }

    return current;
  }
}
