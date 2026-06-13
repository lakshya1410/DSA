/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            l1++;
            temp1=temp1.next;
        }
        int l2=0;
        while(temp2!=null){
            l2++;
            temp2=temp2.next;
        }
        if(l1>l2){
            int dif=l1-l2;
            for(int i=0;i<dif;i++){
                headA=headA.next;
            }
        }
        else{
            int dif=l2-l1;
            for(int i=0;i<dif;i++){
                headB=headB.next;
            }
        }
        while(headA!=null || headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}