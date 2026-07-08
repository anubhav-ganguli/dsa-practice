/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode GetIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempHeadA=headA, tempHeadB=headB;
        while(true)
        {
                       
           
            if(tempHeadB == tempHeadA)
                return tempHeadA;

             if(tempHeadA==null)
                tempHeadA=headB;
            else
                tempHeadA=tempHeadA.next;

            if(tempHeadB==null)
                tempHeadB=headA;   
             else
                tempHeadB=tempHeadB.next; 

           

               
        }

    }
}