//You are given two non-empty linked lists representing two non-negative integer
//s. The digits are stored in reverse order and each of their nodes contain a sing
//le digit. Add the two numbers and return it as a linked list. 
//
// You may assume the two numbers do not contain any leading zero, except the nu
//mber 0 itself. 
//
// Example: 
//
// 
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
// 
// Related Topics Linked List Math


package leetcode.editor.en;
import leetcode.ListNode;

public class AddTwoNumbers {
  public static void main(String[] args) {
       Solution solution = new AddTwoNumbers().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int carry = 0;
        ListNode p = l1, q = l2, curr = result;
        while (p != null || q != null || carry == 1) {
            int value = 0;
            if (p != null) {
                value += p.val;
                p = p.next;
            }
            if (q != null) {
                value += q.val;
                q = q.next;
            }
            value += carry;
            curr.next = new ListNode(value % 10);
            carry = value / 10;
            curr = curr.next;
        }
        return result.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}