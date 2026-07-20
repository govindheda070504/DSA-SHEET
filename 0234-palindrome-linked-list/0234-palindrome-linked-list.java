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

// Optimal Approach
// Intuition:
// 1. Find the middle of the linked list using slow and fast pointers.
// 2. Reverse the second half of the list.
// 3. Compare the first half with the reversed second half.

class Solution {

    // Function to reverse a linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        // Reverse the linked list
        while (curr != null) {
            next = curr.next;    // Store next node
            curr.next = prev;    // Reverse current node's pointer
            prev = curr;         // Move prev forward
            curr = next;         // Move curr forward
        }

        // New head of the reversed list
        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        // Empty list or single node is always a palindrome
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find the middle of the linked list
        // slow moves 1 step, fast moves 2 steps
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // If the list has an odd number of nodes,
        // skip the middle node

//          slow           fast
//           |           |
// 1 -> 2 -> 2 -> 1 -> null // even


//     slow fast
//      |    |
// 1 -> 2 -> 1 -> null // odd // in this case have to move the slow pointer one step ahead and won't compare the moddle node while in the even no of node would compare all the nodes 

        if (fast != null) {
            slow = slow.next;
        }

        // Reverse the second half of the list
        slow = reverse(slow);

        // Start comparing from the beginning
        fast = head;

        // Compare nodes of first half and reversed second half
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;    // Mismatch found
            }
            slow = slow.next;
            fast = fast.next;
        }

        // All corresponding nodes matched
        return true;
    }
}