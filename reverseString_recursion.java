// import java.util.*;
public class reverseString_recursion {
    static void swap(StringBuilder str, int s, int e) {
        char temp = str.charAt(s);
        str.setCharAt(s, str.charAt(e));
        str.setCharAt(e, temp);
    }
    static void reverse(int s,int e, StringBuilder str) {
        if (s > e) {
            return;
        }
        swap(str, s, e);
        s++;
        e--;
        reverse(s, e, str);

    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcde");
        reverse(0, str.length() - 1, str);
        System.out.println(str);
    }
}
