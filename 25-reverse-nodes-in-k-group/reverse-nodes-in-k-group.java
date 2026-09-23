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
    public ListNode reverseKGroup(ListNode head, int k) {
      
     ListNode node = head;
     int count = 0;
     while(node != null && count<k){
          node = node.next;
          count++;
     }   
     if(count<k) return head;
     ListNode prev = reverseKGroup(node,k);
     ListNode curr = head;
     while(count>0){
        ListNode Next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = Next;
        count--;
     }
     return prev;
    }
}