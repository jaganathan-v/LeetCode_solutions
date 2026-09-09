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
    public ListNode detectCycle(ListNode head) {

   ListNode slowPointer = head;
   ListNode fastPointer = head;
   boolean found = false;
   while(fastPointer != null && fastPointer.next != null){
      if(!found){
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next.next;
       }else{
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next;
       }
    if(slowPointer == fastPointer && !found){
            slowPointer = head;
                found = true;  
    }
    if(slowPointer == fastPointer && found){
              return slowPointer;
                
    }
   }
    return null;
    // if(head == null){
    //     return head;
    // }
    // HashSet<ListNode> hs = new HashSet<>();
    // ListNode temp = head;
    // while(temp.next != null){
    //     if(hs.contains(temp)){
    //         return temp;
    //     }
    //     hs.add(temp);
    //     temp = temp.next;
    // }
    // return null;     
    }
}