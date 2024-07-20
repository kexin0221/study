import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
// 使用下标+for遍历
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
// 借助foreach遍历
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
            Iterator<Integer> it = list.listIterator();
            while(it.hasNext()){
                System.out.print(it.next() + " ");
            }
            System.out.println();
        }
}
