import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr={3,5,2,8,7,9,6,1,4,0};
        System.out.println("the original array is "+ Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("the current array is "+Arrays.toString(arr));
    }
    public static void bubblesort(int[] arr){
        int i=0,j=0;
        for(i=0; i < arr.length - 1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
}
