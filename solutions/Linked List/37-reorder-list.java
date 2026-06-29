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
    public void ReorderList(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;

        //Determine the mid point

        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        //Reverse the second LL
        ListNode secondHead=slow.next;
        ListNode prev=null;
        ListNode next=null;

        slow.next=null;

        while(secondHead!=null)
        {
            next=secondHead.next;
            secondHead.next=prev;
            prev=secondHead;
            secondHead=next;
        }

        ListNode firstHead=head;
        secondHead=prev;


        while(secondHead!=null)
        {
        ListNode firstTemp= firstHead.next;
        firstHead.next = secondHead;
        ListNode secondTemp= secondHead.next;
        secondHead.next=firstTemp;
        firstHead=firstTemp;
        secondHead = secondTemp;
        }


    }
}