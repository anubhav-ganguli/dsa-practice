/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode DetectCycle(ListNode head) {

        if(head==null || head.next==null)
            return null;
        ListNode fast=head,slow=head;
        bool isCycle=false;

        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                fast=head;
                isCycle=true;
                break;
            }
        }

        if(!isCycle)
        {
            return null;
        }
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }

        return fast;
    }
}