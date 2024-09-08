package demo;

public class MyLinkedlist implements Ilist{
    static class ListNode{
        public int val;
        public ListNode prev;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;
    public ListNode last;

    @Override
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(head == null){
            head = last = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    @Override
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(head == null){
            head = last = node;
        }else{
            node.prev = last;
            last.next = node;
            last = node;
        }
    }

    @Override
    public void addIndex(int index, int data) {
        int len = size();
        if(index < 0 || index > len){
            System.out.println("index位置不合法!");
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == len){
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = head;
        while(index - 1 != 0){
            cur = cur.next;
            index--;
        }
        ListNode curN = cur.next;
        cur.next = node;
        node.prev = cur;
        node.next = curN;
        curN.prev = node;
    }

    @Override
    public boolean contains(int key) {
        ListNode cur = head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public void remove(int key) {
        ListNode cur = head;
        while(cur != null){
            //注意链表只有一个节点的情况!!!
            if(cur.val == key){
                if(cur == head){
                    head = head.next;
                    if(head != null) {
                        head.prev = null;
                    }
                }else if(cur == last){
                    last = last.prev;
                    last.next = null;
                }else{
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return;
            }
            cur = cur.next;
        }
    }

    @Override
    public void removeAllKey(int key) {
        ListNode cur = head;
        while(cur != null){
            //注意链表只有一个节点的情况!!!
            if(cur.val == key){
                if(cur == head){
                    head = head.next;
                    if(head != null) {
                        head.prev = null;
                    }
                }else if(cur == last){
                    last = last.prev;
                    last.next = null;
                }else{
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
            cur = cur.next;
        }
    }

    @Override
    public int size() {
        int len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        return len;
    }

    @Override
    public void clear() {
        ListNode cur = head;
        while(cur != null){
            ListNode curN = cur.next;
            cur.prev = null;
            cur.next = null;
            cur = curN;
        }
        head = last = null;
    }

    @Override
    public void display() {
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
