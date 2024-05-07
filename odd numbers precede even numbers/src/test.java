import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("the original array is " + Arrays.toString(arr));
        transmit(arr);
    }

    public static void transmit(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 != 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 == 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        System.out.println("the current array is " + Arrays.toString(arr));
    }
}