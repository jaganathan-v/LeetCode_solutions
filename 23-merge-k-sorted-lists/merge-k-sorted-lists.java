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
    public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(ListNode ls:lists){
        ListNode temp = ls;
        while(temp != null){
            pq.add(temp.val);
            temp = temp.next;
        }
    }
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    while (!pq.isEmpty()) {
    current.next= new ListNode(pq.poll()); 
    current = current.next;
    }
    current.next = null;
    ListNode result = dummy.next; 
    return result; 
    }
}