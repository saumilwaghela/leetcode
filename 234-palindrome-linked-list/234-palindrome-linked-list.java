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
        if(head==null || head.next==null) return true; //empty and only 1 char is always palindrome
        ListNode slow = head;
        ListNode fast = head;
        //Logic: Reach mid way and reverse right side and then traverse and compare values in 2 sub-linkedlist
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //reverse logic:
        ListNode prev=null;
        ListNode current = slow.next;
        ListNode next =null;
        while(current!=null){
            next =current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        ListNode subListNode1 = head; //first half: ptr at start wrt original list
        ListNode subListNode2 = prev; //second half: ptr at last wrt original list with reversed links;
        
        while(subListNode1!=null && subListNode2!=null){
            if(subListNode1.val != subListNode2.val) return false;
            subListNode1=subListNode1.next;
            subListNode2=subListNode2.next;
        }
        return true;
    }
}