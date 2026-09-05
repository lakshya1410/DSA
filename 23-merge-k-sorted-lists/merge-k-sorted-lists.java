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
    public ListNode mergeKLists(ListNode[] lists) {
        return partionandmerge(0,lists.length-1,lists);
    }
    ListNode partionandmerge(int start,int end ,ListNode[] lists){
        if(start>end) return null;
        if(start==end) return lists[start];
        int mid=start+(end-start)/2;
        ListNode l1=partionandmerge(start,mid,lists);
        ListNode l2=partionandmerge(mid+1,end,lists);
        return merge(l1,l2);
    }
    ListNode merge(ListNode h1,ListNode h2){
        if(h1==null) return h2;
        if(h2==null) return h1;
        if(h1.val<=h2.val){
            h1.next=merge(h1.next,h2);
            return h1;
        }else{
            h2.next=merge(h1,h2.next);
            return h2;
        }
        
    }
}