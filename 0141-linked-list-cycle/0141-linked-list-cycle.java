import java.util.*;
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
        HashSet <ListNode> result = new HashSet<>();
        while(head!=null){
            if(result.contains(head)){
                return true;
            }
            else{
                result.add(head);
            }
            head=head.next;
        }
        return false;
        
    }
}