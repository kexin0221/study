package demo;

public class MyQueue {

    static class ListNode {
        public ListNode prev;
        public ListNode next;
        public int val;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;
    public ListNode last;
    public int size = 0;

    public void offer(int e){
        ListNode node = new ListNode(e);
        if (head == null) {
            head = last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }

    public int poll() {
        if (head == null) {
            return -1;
        }
        ListNode po = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
        return po.val;
    }

    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

