import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @return string字符串
     */
    public static String setstring (String str) {
        // write code here
        StringBuilder news = new StringBuilder();
        boolean[] arr = new boolean[128];

        for(int i = 0;i<str.length();i++){
           char ch = str.charAt(i);
           if(!arr[ch]){
               news.append(ch);
               arr[ch] = true;
           }
        }

        return news.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String ret = setstring(str);
        System.out.println(ret);
    }
}





