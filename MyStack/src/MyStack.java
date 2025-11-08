import java.util.Arrays;

public class MyStack {
    public int[] elem;
    public int usedSize;

    public MyStack() {
        this.elem = new int[10];
    }

    public void push(int val) {
        if(isFull()) {
            this.elem = Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize++] = val;
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int val = elem[usedSize-1];
        usedSize--;
        return val;
    }
    //获取栈顶元素 但是不删除
    public int peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elem[usedSize - 1];
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }
}