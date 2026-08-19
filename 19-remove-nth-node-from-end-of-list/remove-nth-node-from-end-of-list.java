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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
         if(n == cnt) {
            return head.next;
        }
        int n1=cnt-n;
        temp=head;
        while(n1>1){
            temp=temp.next;
            n1--;
        }
        temp.next=temp.next.next;
        return head;
    }
}