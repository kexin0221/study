import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "eo";
        ArrayList<Character> ret = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(!str2.contains(ch+"")){
                ret.add(ch);
            }
        }

        for (int i = 0; i < ret.toArray().length; i++) {
            System.out.print(ret.get(i) + " ");
        }
    }
}
