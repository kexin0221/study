package listtest;

public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.display();

        System.out.println(myArrayList.isFull());

        myArrayList.add(5,6);
        myArrayList.display();

        System.out.println(myArrayList.contains(4));

        System.out.println(myArrayList.indexOf(4));

        System.out.println(myArrayList.get(4));

        myArrayList.set(0,99);
        myArrayList.display();

        myArrayList.remove(5);
        myArrayList.display();

        System.out.println(myArrayList.size());

        myArrayList.clear();
        myArrayList.display();

    }
}
