import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2=transform(arr1);
        System.out.println("the original array is "+ Arrays.toString(arr1));
        System.out.println("the current array is "+ Arrays.toString(arr2));
    }
    public static int[] transform(int[] array){
        int[] ret = new int[array.length];
        int i = 0;
        for(i = 0;i < array.length; i++){
            ret[i]=array[i]*2;
        }
        return ret;
    }
}
