import java.util.*;
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int[] arr = new int[m + n];
        for (int i = 0; i < m; i++) {
            arr[i++] = A[i++];
        }
        for (int i = m; i < m + n; i++) {
            int j = 0;
            arr[i++] = B[j++];
        }
        Arrays.sort(arr);
    }
}