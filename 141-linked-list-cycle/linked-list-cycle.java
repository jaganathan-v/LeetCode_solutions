/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
        return false;
    }
    ListNode slowPointer = head;
    ListNode fastPointer = head;
    while(fastPointer != null && fastPointer.next!= null){
		 slowPointer = slowPointer.next;
		 fastPointer = fastPointer.next.next;
             if(slowPointer == fastPointer) {
			 return true;
		 }
	  }
	  return false;
    // if(head == null){
    //     return false;
    // }
    // HashSet<ListNode> hs = new HashSet<>();
    // ListNode temp = head;
    // while(temp.next != null){
    //     if(hs.contains(temp)){
    //         return true;
    //     }
    //     hs.add(temp);
    //     temp = temp.next;
    // }
    // return false;  
    }
}