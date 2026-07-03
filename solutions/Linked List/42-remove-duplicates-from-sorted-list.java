/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode DeleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode tempCurr = curr;
        while(curr!=null)
        {
            while(tempCurr.next!=null && tempCurr.next.val == curr.val)
            {
                tempCurr=tempCurr.next;
            }

            tempCurr=tempCurr.next;
            curr.next=tempCurr;
            curr=curr.next;
        }

        return head;
    }
}