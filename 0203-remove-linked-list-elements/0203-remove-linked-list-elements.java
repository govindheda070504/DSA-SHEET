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
    public ListNode removeElements(ListNode head, int val) {
       
// intuition :(using dummy node)

// initial mapping
//  prev  curr
//   |     |
//  -1 -> 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6 
//   |
//  dummy


// here is the second image when the (curr==val) where val == 6
//            prev curr
//             |    |
//  -1 -> 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6 
//   |    |
//  dummy head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr!= null){
            if(curr.val == val){ 
                prev.next = curr.next; // removing the value where current node val matches the target value 
                curr= prev.next;
            }else{
                prev=curr; // can also write prev=prev.next // else would be be moving both the pointer 1 by ahead 
                curr=curr.next;
              
            }
        }
        return dummy.next;
        
    }
}