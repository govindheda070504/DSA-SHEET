/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //  we can have 2 solution  1. Using Hashset  add the each element to the hashset and and checking wheather it is already present in the hashset or not !
 // 2. using using slow and fast pointer //Algorithm: Floyd's Tortoise and Hare

// slow moves 1 step at a time.
// fast moves 2 steps at a time.
// If there is a cycle, fast will eventually catch up with slow.
// If fast reaches null (or fast.next == null), there is no cycle.


public class Solution {
    public boolean hasCycle(ListNode head) {
     ListNode slow = head;
     ListNode fast = head;
     // Empty list or single node without a self-loop
    if (head==null||head.next == null){
        return false;
    }
        // Move slow by 1 step and fast by 2 steps
     while (fast != null && fast.next!=null){ // we will run the loop until fast pointer  becomes null if  in between  fast and slow pointer becomes equal means cycle exists
            fast = fast.next.next;
            slow = slow.next;
         // If they meet, a cycle exists
            if(fast == slow){
                return true;
            }            
        }
        return false;
    }
}