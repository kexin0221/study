package list;

import java.util.ArrayList;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] ret = new ListNode[100];
        int t = 0;
        while (head != null) {
            ret[t++] = head;
            head = head.next;
        }
        return ret[t / 2];
    }
}
