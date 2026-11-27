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
    //  List<Integer> ls = new ArrayList<>();

        
    //     ListNode temp = list1;
    //     ListNode temp2 = list2;
    //     if(list1.size()>=list2.size()){
    //     while(temp != null && temp2 != null){
    //         if(list)
    //         list.add(temp.data);
    //         temp = temp.next;
    //     }
    



         


   if(list1 == null) return list2;
   else if (list2 == null) return list1;
    ListNode result = new ListNode();
    ListNode temp = result;

    while(list1 != null || list2 != null){


        if(list1 == null){
            temp.next = new ListNode(list2.val);
            temp = temp.next;
            list2 = list2.next;
        }else if(list2 == null){
            temp.next = new ListNode(list1.val);
            temp = temp.next;
            list1 = list1.next;
        }




        if((list1 != null && list2 != null) && ( list1.val <= list2.val)){
            temp.next = new ListNode(list1.val);
            list1 = list1.next;
            temp = temp.next;
        }
        if((list1 != null && list2 != null) && ( list2.val <= list1.val)){
            temp.next = new ListNode(list2.val);
            list2 = list2.next;
            temp = temp.next;
        }


        
        
    }
    temp.next = null;
    return result.next;
    
    }
}