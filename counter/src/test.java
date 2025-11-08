public class test {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,6,7,7,7};
        Counter(arr);
    }

    public static void Counter(int[] arr) {
        int count;
        for (int i = 0; i < arr.length; i += count) {
            int num = arr[i];
            count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println("the count of " + num + " is " +count);
        }
    }
}
