package simpletest.string;

public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        char str[] = {'a','b','c'};
        String s4 = new String(str);
        System.out.println(s1 == s2);
    }
}
