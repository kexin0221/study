package demo;

public class Test {
    public static void main(String[] args) {
        Solution list = new Solution();
        list.createNode();
        list.display();

        Solution.ListNode ret = list.reverseList();
        list.display2(ret);
    }
}
