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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // initution : slow and fast pointer; at the beggining of the dummy node 
        // used dummy node as if in linkedlist 1 -> 2 -> 3 -> null  n=3  means we have to remove the head only in this case so if we initialise fast and slow pointer  on the head  we wont be able to handle the edge case 
        

        ListNode dummy = new ListNode(-1);
        dummy.next= head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // movinf the fast pointer the n times 
        
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
//         slow        
//          |  
//        Dummy -> 1 -> 2 -> 3 -> 4 -> 5
//          |
//         fast

//        n=2
//         slow        
//          |  
//        Dummy -> 1 -> 2 -> 3 -> 4 -> 5
//                      |
//                     fast


//                         slow        
//                           |  
//        Dummy -> 1 -> 2 -> 3 -> 4 -> 5
//                                     |
//                                    fast
        while(fast.next!=null){ // here we have taken fast.next because as soon as the  next node of fast pointer points the null the fast pointer will point the last elemnent of the linkedlist
        fast=fast.next;
        slow=slow.next; // at this point the slow pointer will point the  node  JUST BEFORE that has to be removed

        }
        slow.next = slow.next.next;
        return dummy.next;


    }
}