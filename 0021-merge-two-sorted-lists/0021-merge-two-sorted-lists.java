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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 2 pointer approach
    //         list1            list2
    //          |                |
    // list1 = [1,2,4], list2 = [1,3,4] comparing the value whichever is smaller append it in the result list  and increment the pointer whose value was smaller;
    //  result=[]
        ListNode result = new ListNode(-1);
        ListNode current = result;

        while (list1 != null && list2!= null){
            if(list1.val<=list2.val){
                current.next= new ListNode(list1.val);
                list1=list1.next;
                current = current.next;

            }else{
                current.next = new ListNode(list2.val);
                list2=list2.next;
                current = current.next;
            }
        }
        // appending the leftover list (just a visual )
        //               list1
        //                 |
        // 1 -> 2 -> 4 -> null
        
        //          list2
        //           |
        // 1 -> 3 -> 4 -> null  // apending the leftover to result linkedlist

        if(list1 !=null){
            current.next=list1;
          //  list1=list1.next;
          //  current = current.next;    these 2 lines are unnecessary though solution wont be affected  but this would also work :current.next=list1;
/*
        result: 1 -> 2
                     ^
                  current

        list1: 3 -> 5 -> 7
               ^
             list1

             if we do  current.next = list1;

             1 -> 2 -> 3 -> 5 -> 7
*/
        }
        if(list2 !=null){
            current.next=list2;
            // list1=list2.next;
            // current = current.next;
        }
        return result.next;
        
    }
}