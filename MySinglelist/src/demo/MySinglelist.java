package demo;

public class MySinglelist implements IList{
    static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;

    public void createNode(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        this.head = node1;
    }

    @Override
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    @Override
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(head == null){
            head = node;
            return;
        }
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }

    @Override
    public void addIndex(int index, int data) {
        int len = this.size();
        if(index > len || index < 0){
            System.out.println("index位置不合法!!");
            return;
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
        while (index - 1 != 0) {
            cur = cur.next;
            index--;
        }

        node.next = cur.next;
        cur.next = node;
    }

    @Override
    public boolean contains(int key) {
        ListNode cur = head;
        while(cur != null){
            if( cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public void remove(int key) {
        ListNode cur = head;

        if(head == null){
            return;
        }

        if(head.val == key){
            head = head.next;
            return;
        }
        ListNode fr = this.findNodeOfKey(key);
        if(fr == null){
            return;
        }
        ListNode re = fr.next;
        fr.next = re.next;
    }

    private ListNode findNodeOfKey(int key){
        ListNode cur = head;
        while(cur.next != null){
            if(cur.next.val == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    @Override
    public void removeAllKey(int key) {
        if (head == null) {
            return;
        }

        while (head != null && head.val == key) {
            head = head.next;
        }

        if (head == null) {
            return;
        }

        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.val == key) {
                // 跳过当前节点的下一个节点
                cur.next = cur.next.next;
            } else {
                // 继续遍历
                cur = cur.next;
            }
        }
    }

    @Override
    public int size() {
        ListNode cur = head;
        int len = 0;
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
            cur.next = null;
            cur = cur.next;
        }
        head = null;
    }

    @Override
    public void display() {
        ListNode cur = head;
        while( cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
