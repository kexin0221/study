package chapter19;

public class AnyWildCardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        // 先计算最大值
        System.out.println("The max number is " + max(intStack));
        // 再打印（此时栈已为空）
        print(intStack);

        GenericStack<String> sStack = new GenericStack<String>();
        sStack.push("hello");
        sStack.push("world");
        sStack.push("apple");

//        System.out.println("The max string is " + max(sStack));
        print(sStack);
    }

    /** Print objects and empties the stack */
//  public static void print(GenericStack<? extends Number> stack) {
    public static void print(GenericStack<?> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static double max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue(); // initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }
        return max;
    }

}
