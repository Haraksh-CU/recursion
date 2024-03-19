import java.util.*;

public class practice1 {
    static void display(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        display(n - 1);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        display(n);
    }
}