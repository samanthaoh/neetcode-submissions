/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> past = new HashSet<>();
        ListNode curr = head;

        while (curr != null){
            if (past.contains(curr)){
                return true;
            } else {
                past.add(curr);
            }
            curr = curr.next;
        }
        return false;
    }
}
