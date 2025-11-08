public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }


    public static int lengthOfLongestSubstring(String s) {
        int[] count = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count[i] = j - i ;
                    break;
                }
            }
        }
        int max = count[0];
        for (int i = 0; i < s.length(); i++) {
            if(max<count[i]){
                int tmp = max;
                max = count[i];
                count[i] = tmp;
            }
        }
        return max;
    }

}
