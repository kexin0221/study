package demo;

public class test {

    public static void main(String[] args) {
        char[] s1 = {'C','o','m','e',',','o','n'};
        char[] s2 = {'g','i','r','l','s'};
        MyString1 string1 = new MyString1(s1);
        MyString1 string2 = new MyString1(s2);

        System.out.println("The first char of string1 is " + string1.charAt(0));
        System.out.println("The length:" + string1.length());
        System.out.println("Is string1 equals string2? " + string1.equals(string2));
    }
}