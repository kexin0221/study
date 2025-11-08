package demo;

public class Test {
    public static void main(String[] args) {
        MySinglelist list = new MySinglelist();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();

        list.addFirst(99);
        list.display();

        list.addIndex(6,78);
        list.display();

        System.out.println(list.contains(3));
        System.out.println(list.contains(78));
        System.out.println(list.contains(96));

        System.out.println(list.size());

        list.remove(78)
        list.display();
        list.remove(99);
        list.display();

        list.addFirst(2);
        list.addLast(2);
        list.removeAllKey(2);
        list.display();

        list.clear();
        list.display();
    }
}
