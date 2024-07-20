package List;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<List<Integer>> ret = generate(6);
        for (int i = 0; i < ret.size(); i++) {
            for (int j = 0; j < ret.get(i).size(); j++) {
                System.out.print(ret.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows){
        //List<List<Integer>>相当于二维数组
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> List0 = new ArrayList<>();
        ret.add(List0);
        List0.add(1);

        for (int i = 1; i < numRows ; i++) {
            List<Integer> curRow = new ArrayList<>();
            //每一行第一个元素
            curRow.add(1);
            //每一行中间的元素
            List<Integer> preRow = ret.get(i-1);
            for (int j = 1; j < i; j++) {
                curRow.add(preRow.get(j-1) + preRow.get(j));
            }
            //每一行最后一个元素
            curRow.add(1);

            ret.add(curRow);
        }
        return ret;
    }
}
