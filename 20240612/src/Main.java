import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组 
     * @param target int整型 
     * @return int整型
     */
    public int search(int[] nums, int target) {
        // write code here
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //只出现一次的数字
        int[] arr = {4,1,2,1,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] a = new int[arr.length];

        int count = 0;
        for (int value : arr) {
            int j = 0;
            if (arr[value] % 2 == 1) {
                a[j++] = value;
            }
            count = j + 1;
        }
        for (int k : arr) {
            int j = count;
            if (arr[k] % 2 == 0) {
                a[j++] = k;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        System.out.println(count);
    }
}