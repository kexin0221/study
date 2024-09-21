public class Test {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(45);
        stack.push(56);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}
