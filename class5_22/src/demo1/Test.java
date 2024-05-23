package demo1;

import javax.naming.Name;
import java.util.Arrays;

public class Test {
    
    //模拟冒泡排序
    public static void mySort(Comparable[] comparables){
        for (int i = 0; i < comparables.length-1; i++) {
            for(int j = 0; j < comparables.length-1-i; j++){
                if(comparables[j].compareTo(comparables[j+1]) > 0){
                    Comparable tmp = comparables[j];
                    comparables[j] = comparables[j+1];
                    comparables[j+1] = tmp;
                   
                }
            }
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",10);
        students[1] = new Student("lisi",19);
        students[2] = new Student("abc",8);

        System.out.println("排序前："+ Arrays.toString(students));

        NameComparator nameComparator = new NameComparator();
        //mySort(students);
        Arrays.sort(students,nameComparator);

        System.out.println("排序后："+ Arrays.toString(students));

    }
}
