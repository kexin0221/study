import java.util.Arrays;
import java.util.OptionalInt;
public class test {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(count(arr));

    }
    public static int count(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>arr.length/2){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
