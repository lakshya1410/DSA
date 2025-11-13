/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        Map<Node,Node> mp = new HashMap<>();
        while(temp!=null){
            Node copynode = new Node(temp.val);
            mp.put(temp,copynode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node copynode= mp.get(temp);
            copynode.next= mp.get(temp.next);
            copynode.random=mp.get(temp.random);
            temp=temp.next;
        }
       return mp.get(head);
    }
}