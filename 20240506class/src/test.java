import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int[] arr={6,2,8,3,65,9,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(binarySearch(array,6));
//        my_toString(array);
//        System.out.println(array);
//        int[] ret=func1(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(ret));
//        func2(array);
//        System.out.println(Arrays.toString(array));
    }
    public static int[] func1(int[] array){
        int[] ret = new int[array.length];
        for(int i=0; i<array.length; i++){
            ret[i]=array[i]*2;
        }
        return ret;
    }
    public static void func2(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=array[i]*2;
        }
    }
    public static void my_toString(int[] array){
        int num = array.length;
        System.out.print('[');
        for(int i=0;i<num;i++){
            System.out.print(array[i]);
            if(i==num-1){
                break;
            } else{
                System.out.print(',');
            }
        }
        System.out.print(']');
    }
    public static int binarySearch(int[] array,int key){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(key<array[mid]){
                right=mid-1;
            }else if(key>array[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
