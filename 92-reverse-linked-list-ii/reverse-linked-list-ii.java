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
    public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode current = null;
    ListNode prev = null;
    ListNode Next =null;
    ListNode beforeLeft = null;
    ListNode before = null;
    ListNode temp = head;
    ListNode leftNode = current;
    int pos = 1;

    while(temp != null){
        if(pos == left){
            current = temp;
            Next = temp.next;
            leftNode  = current;
            beforeLeft = before;
            prev = before;
        }
        before = temp;
        temp = temp.next;
        pos++;
    }
    
    int count = right - left +1;
    while(count>0){
        Next = current.next;
        current.next = prev;
        prev = current;
        current = Next;
        count--;
    }

    if(beforeLeft == null){
        head = prev;
    }else{
        beforeLeft.next = prev;
    }
    leftNode.next = current; 
    return head;
    }
}