package demo;

public class Test {
    public static void main(String[] args) {
        MyLinkedlist list = new MyLinkedlist();

        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.display();

        list.addLast(99);
        list.display();

        System.out.println(list.size());

        System.out.println(list.contains(1));
        System.out.println(list.contains(100));

        list.addIndex(4,78);
        list.display();

        list.remove(78);
        list.display();

        list.addIndex(0,36);
        list.addIndex(3,36);
        list.display();
        list.removeAllKey(36);
        list.display();

        list.clear();
        list.display();
    }
}
