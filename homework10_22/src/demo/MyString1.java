package demo;

public class MyString1 {
    private final char[] ch;

    public MyString1(char[] chars) {
        ch = chars;
    }

    public char charAt(int index) {
        return ch[index];
    }

    public int length() {
        return ch.length;
    }

    public MyString1 substring(int begin,int end) {
        char[] newch = new char[end - begin];

        if (end - begin >= 0) System.arraycopy(this.ch, begin + begin, newch, begin, end - begin);

        return new MyString1(newch);
    }

    public MyString1 toLowerCase() {
        char[] string = new char[ch.length];
        System.arraycopy(ch, 0, string, 0, ch.length);
        for(int i = 0;i < ch.length;i ++) {
            if(string[i] >= 'A' && string[i] <= 'Z')
                string[i] = (char) (string[i] + 32);
        }
        return new MyString1(string);
    }

    public boolean equals(MyString1 s) {
        boolean flag = true;

        if(this.ch.length != s.ch.length)
            flag = false;
        else {
            for(int i = 0;i < this.ch.length;i ++)
                if(this.ch[i] != s.ch[i]) {
                    flag = false;
                    break;
                }
        }
        return flag;
    }

    public static MyString1 valueOf(int i) {
        char[] c = {(char)i};
        return new MyString1(c);
    }
}
