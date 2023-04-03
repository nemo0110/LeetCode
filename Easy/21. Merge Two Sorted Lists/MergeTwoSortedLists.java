/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.


Example 1:

1->2->4
1->3->4
1->1->2->3->4->4

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]


Example 2:

Input: list1 = [], list2 = []
Output: []


Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.


     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummyHead = new ListNode(0);
            ListNode curr = dummyHead;
            while(list1 != null || list2 != null){
                if(list1!= null ){
                    if(list2 != null){
                        if(list1.val <= list2.val){
                            curr.next = new ListNode(list1.val);
                            curr = curr.next;
                            list1 = list1.next;
                        }else{
                            curr.next = new ListNode(list2.val);
                            curr = curr.next;
                            list2 = list2.next;
                        }
                    }else{
                        curr.next = new ListNode(list1.val);
                        curr = curr.next;
                        list1 = list1.next; 
                    }
                }else{
                     curr.next = new ListNode(list2.val);
                     curr = curr.next;
                     list2 = list2.next;
                }
            }
            return dummyHead.next;
        }
    
        public ListNode mergeTwoLists1(ListNode l1, ListNode l2){
    		if(l1 == null) return l2;
    		if(l2 == null) return l1;
    		if(l1.val < l2.val){
    			l1.next = mergeTwoLists1(l1.next, l2);
    			return l1;
    		} else{
    			l2.next = mergeTwoLists1(l1, l2.next);
    			return l2;
    		}
    }
