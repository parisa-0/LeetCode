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
                        //L1
                        //1 -> 2 -> 4 -> null
 //newNode -> Current (0) 
                       //L2   
                       //1 -> 3 -> 4 -> null

               //1.Create a prehead, so we could return at the end of the problem
              //2.Loop through L1 and L2 until one of the lists is null
              //3.Compare the values of two nodes

              ListNode newNode = new ListNode();
              ListNode curr = newNode;
              while(list1 != null && list2 != null) {
                    if(list1.val < list2.val) {
                     curr.next = list1;
                     list1 = list1.next; 
                    }
                    else {
                     curr.next = list2;
                     list2 = list2.next; 
                    }
                    curr = curr.next;
              }
        curr.next = list1 == null ? list2 : list1;
     return newNode.next;
    }
}
