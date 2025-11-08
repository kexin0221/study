import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(binarySearch(arr,5));
    }
    public static int binarySearch(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(key<arr[mid]){
                right=mid-1;
            }else if(key>arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
