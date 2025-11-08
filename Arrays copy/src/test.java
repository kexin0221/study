import java.util.Arrays;
public class test{
    public void func(){
    // newArr和arr引用的是同一个数组
    // 因此newArr修改空间中内容之后，arr也可以看到修改的结果
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = arr;
        newArr[0] = 10;
        System.out.println("newArr: " + Arrays.toString(arr));
// 使用Arrays中copyOf方法完成数组的拷贝：
// copyOf方法在进行数组拷贝时，创建了一个新的数组
// arr和newArr引用的不是同一个数组
        arr[0] = 1;
        newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("newArr: " + Arrays.toString(newArr));
// 因为arr修改其引用数组中内容时，对newArr没有任何影响
        arr[0] = 10;
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("newArr: " + Arrays.toString(newArr));
// 拷贝某个范围.
        int[] newArr2 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("newArr2: " + Arrays.toString(newArr2));
    }
}
