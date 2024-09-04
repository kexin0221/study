package demo;

public class Solution {
    static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;

    public void createNode(){
        ListNode node1 = new ListNode(12);
        ListNode node2 = new ListNode(23);
        ListNode node3 = new ListNode(34);
        ListNode node4 = new ListNode(45);
        ListNode node5 = new ListNode(56);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        head = node1;
    }

    public void display2(ListNode newHead){
        ListNode cur = newHead;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void display(){
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public ListNode reverseList() {
        if(head == null) {
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while(cur != null) {
            ListNode curN = cur.next;
            cur.next = head;
            head = cur;
            cur = curN;
        }
        return head;
    }
}
