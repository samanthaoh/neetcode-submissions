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
        HashSet storage = new HashSet<>();
        ListNode iterator = head;

        while (iterator != null){
            if (storage.contains(iterator))
                return true;
            else {
                storage.add(iterator);
                iterator = iterator.next;
            }
                 
        }
        return false;        
    }
}
