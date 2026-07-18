import java.util.*;
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
    public boolean isPalindrome(ListNode head) {
        ListNode current = head;
        StringBuilder sb = new StringBuilder();
        
        // initution is append all the value of linkedlist in a string and reverse if orignal and reversed is same then return true else false ;
        while(current!=null){
            sb.append(current.val);
            current=current.next;
        }
        String orignal =sb.toString();
        String reversed =sb.reverse().toString();
        if(orignal.equals(reversed)){
            return true;
        }
        
        return false;
    }
}