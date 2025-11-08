import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 入栈操作
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 查看栈顶元素
        System.out.println("栈顶元素: " + stack.peek());

        // 出栈操作
        int item = stack.pop();
        System.out.println("出栈元素: " + item);

        // 判断栈是否为空
        System.out.println("栈是否为空: " + stack.isEmpty());
    }
}
