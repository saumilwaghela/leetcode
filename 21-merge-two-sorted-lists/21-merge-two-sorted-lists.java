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
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        ListNode ptr =  new ListNode();
        ListNode head = ptr;
        while(node1!=null && node2!=null){
            if(node1.val < node2.val){
                ptr.next = node1;
                ptr = ptr.next;
                node1 = node1.next;
            }
            else{
                ptr.next = node2;
                ptr = ptr.next;
                node2 = node2.next;
            }
        }
        if(node1==null){
            ptr.next = node2;
        }
        if(node2==null){
           ptr.next = node1;
        }
        return head.next;
    }
}