import java.util.*;

class power_recursion {
    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        int ans = power(a, b / 2);
        if (b % 2 == 0) {
            return ans * ans;
        }
        else {
            return a * ans * ans;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int ans = power(a, b);
        System.out.println(ans);
    }
}